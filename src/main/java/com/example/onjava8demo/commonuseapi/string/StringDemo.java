package com.example.onjava8demo.commonuseapi.string;

/**
 * 描述:
 *
 * @author xuliang
 * @create 2019-09-24 14:07
 */
public class StringDemo {

   /* java.lang.Math

    提供sin, cos, tan, exp, log, log10 等类方法，PI和E等类字段

    java.lang.String（StringBuilder线程不安全，StringBuffer线程安全）

    boolean equals(Object other)
    boolean equalsIngoreCase(String other)	如果字符串与other相等，返回true
            忽略大小写
    int length()	返回字符串的长度
    String substring(int beginIndex)
    String substring(int beginIndex, int endIndex)	返回一个新字符串，包含原始字符串从beginIndex到串尾或到endIndex-1的所有代码单元
    String toLowerCase()
    String toUpperCase()	返回小写字符串
    返回大写字符串
    int indexOf(String str[, int fromIndex])
    int lastIndexOF(String str[, int fromIndex])	返回第一个/最后一个子串的位置,从起始位置或者fromIndex开始*/

    public static void main(String[] args) {
//      char charAt(int index)	返回字符串中指定位置的字符
        String str = "helloWord20190924";
        String str001 = "helloWord20190924";
        char c = str.charAt(3);
        System.out.println("c = " + c);

//        boolean equals(Object other)     比较2个字符串的内容是否相等

        boolean equals = str001.equals(str);
        System.out.println("equals = " + equals);


    }


}