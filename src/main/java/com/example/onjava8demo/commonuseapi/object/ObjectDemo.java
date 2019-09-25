package com.example.onjava8demo.commonuseapi.object;

import java.util.Random;

/**
 * 描述:
 *
 * @author xuliang
 * @create 2019-09-24 15:37
 */
public class ObjectDemo {
    public static void main(String[] args) {
/*
        java.util.Radom

        Random()	构建一个新的随机数生成器
        int nextInt(int n)	返回一个 0 ~ n-1之间的随机数

        java.lang.Object

        String toString()	返回描述该对象值的字符串。在自定义类中应覆盖这个方法
        boolean equals(Object otherObject)	比较两个对象是否相等。在自定义类中应覆盖这个方法
        Class getClass()
        int hashCode()	返回包含对象信息的类对象
                返回对象的散列码
        static wait()
        static notify()
        static notifyAll()
*/
//       1 100
        Random random = new Random();
        int i = random.nextInt(100)+1;
        System.out.println("i = " + i);









    }

}