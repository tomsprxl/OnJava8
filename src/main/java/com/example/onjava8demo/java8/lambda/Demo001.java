package com.example.onjava8demo.java8.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 描述:
 *
 * @author xuliang
 * @create 2019-09-23 16:34
 */
public class Demo001 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("1", "3", "2", "4");

        Collections.sort(names, (a,b)->a.compareTo(b));


        names.forEach(System.out::println);



    }

}