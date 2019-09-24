package com.example.onjava8demo.java8.lambda;

/**
 * 描述:
 *
 * @author xuliang
 * @create 2019-09-23 16:48
 */
public class Demo002 {
    public static void main(String[] args) {
        Converter<String, Integer> converter = (from) -> Integer.valueOf(from);
        Integer converted = converter.convert("123");
        System.out.println(converted);    // 123
    }
}