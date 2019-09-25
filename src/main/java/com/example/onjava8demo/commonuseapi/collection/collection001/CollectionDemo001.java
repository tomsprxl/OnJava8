package com.example.onjava8demo.commonuseapi.collection.collection001;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

/**
 * 描述:
 *
 * @author xuliang
 * @create 2019-09-25 11:56
 */
public class CollectionDemo001 {
    public static void main(String[] args) {
        /*
       ListIterator<E> listIterator()
ListIterator<E> listIterator(int index)	返回一个列表迭代器
迭代器第一次调用next返回给定位置元素
void add(int i, E element)
void addAll(int i, Colletion<? extend E> elements)	向集合指定位置添加元素
E remove(int i)	删除给定位置元素并返回
E get(int i)	获得给定位置元素并返回
E set(int i, E element)	设置给定位置元素并返回原来的元素
int indexOf(Object element)
int lastIndexOf(Object element)	返回与指定元素相等元素在列表中第一次出现的位置
返回与指定元素相等元素在列表中最后一次出现的位置

        */

        List<String> list = new ArrayList<>(Arrays.asList("001", "002", "003","009","002","002"));
//        ListIterator<String> listIterator = list.listIterator();
//        ListIterator<String> iterator = list.listIterator(2);
//        String next = iterator.next();
//        System.out.println("next = " + next);
/*
        String remove = list.remove(2);
        System.out.println("remove = " + remove);
        */
        /*String s = list.get(2);
        System.out.println("s = " + s);
        */

        /*String set = list.set(2, "005");

        list.forEach(System.out::println);
        */
        /*
        int i = list.indexOf("002");
        System.out.println("i = " + i);
        */
        int i = list.lastIndexOf("002");
        System.out.println("i = " + i);





    }

}