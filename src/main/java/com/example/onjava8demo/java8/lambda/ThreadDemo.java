package com.example.onjava8demo.java8.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 描述:
 *
 * @author xuliang
 * @create 2019-09-24 9:07
 */
public class ThreadDemo {

    public static void main(String[] args) {
        List<Runnable> runnableList = new ArrayList<>();
        ThreadResource resource = new ThreadResource();
        runnableList.add(() -> resource.print(resource.firstCondition, resource.secondCondition));
        runnableList.add(() -> resource.print(resource.secondCondition, resource.thirdCondition));
        runnableList.add(() -> resource.print(resource.thirdCondition, resource.firstCondition));

        for (int i = 0; i < runnableList.size(); i++) {
            new Thread(runnableList.get(i), "线程" + i).start();
        }

    }


    static class ThreadResource {
        //初始值
        int num = 0;

        ReentrantLock lock = new ReentrantLock();
        Condition firstCondition = lock.newCondition();
        Condition secondCondition = lock.newCondition();
        Condition thirdCondition = lock.newCondition();

        public void print(Condition self, Condition next) {
            lock.lock();
            try {
                while (num < 99) {
                    num += 1;
                    System.out.println("当前线程: " + Thread.currentThread().getName() + "num =" + num);
                    next.signal();
                    self.await();
                }
                next.await();
            } catch (Exception e) {

            } finally {
                lock.unlock();
            }
        }

    }

}