package com.example.onjava8demo.commonuseapi.array;


import java.util.Arrays;

/**
 * 描述:
 *
 * @author xuliang
 * @create 2019-09-24 15:09
 */
public class ArrayDemo {
    public static void main(String[] args) {

//        for each循环
//        for(variable : collection) statement
//
//        collection这一集合表达式必须是一个数组或者是一个实现了Iterable接口的类对象
//
//        java.util.Arrays
// 
//        static String toString(type[] a)	返回包含a中数据元素的字符串
//        static void sort(type[] a)	采用优化的快速排序算法对数组进行排序
//        static int binarySearch(Object[] a, Object key)	使用二分搜索算法查找值v
//        static Boolean equals(type[] a, type[] b)	如果两个数字相同，返回true
//        数组名.length

        String[] strings001 = {"022", "011", "055", "099", "010", "033",};
        String[] strings002 = {"022", "011", "055", "099", "010", "0334",};

        System.out.println(strings001.length);


    }

}