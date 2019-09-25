package com.example.onjava8demo.commonuseapi.string;

import java.util.Objects;

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





    返回大写字符串
    int indexOf(String str[, int fromIndex])
    int lastIndexOF(String str[, int fromIndex])	返回第一个/最后一个子串的位置,从起始位置或者fromIndex开始*/

    public static void main(String[] args) {
//      char charAt(int index)	返回字符串中指定位置的字符
//        String str = "helloWord20190924";
//        String str001 = "helloWord20190924";
//        char c = str.charAt(3);
//        System.out.println("c = " + c);
//
////        boolean equals(Object other)     比较2个字符串的内容是否相等
//
//        boolean equals = str001.equals(str);
//        System.out.println("equals = " + equals);
//        boolean equals1 = str.equals(null);
//        System.out.println("equals1 = " + equals1);
////        boolean equals2 = str.equals(null);
////        System.out.println("equals2 = " + equals2);
//        boolean equals3 = Objects.equals(str, null);
//        System.out.println("equals3 = " + equals3);
//
//        String s = Objects.requireNonNull(str);
//        System.out.println("s = " + s);
//
        //boolean equalsIngoreCase(String other)	如果字符串与other相等，返回true
        //            忽略大小写

//        boolean b = str.equalsIgnoreCase(str001);
//        System.out.println("b = " +

//        int length()	返回字符串的长度
//        int length = str001.length();
//        System.out.println("length = " + length);

//      String substring(int beginIndex)   从指定字符串位置开始一直截取到最后
//        String str = "0123456789";
//        String substring = str.substring(5);
//        System.out.println("substring = " + substring);


//        String substring(int beginIndex, int endIndex)	截取字符串从第一个指定位置到第二个指定位置减一 的字符串

//        String substring = str.substring(5, 7);
//        System.out.println("substring = " + substring);
        //String toLowerCase() 返回字符串的小写形式
        // String toUpperCase() 返回字符串的大写形式
//        String str = "helloWorld";
//        String s = str.toLowerCase();
//        System.out.println("s = " + s);
//
//        String s1 = str.toUpperCase();
//        System.out.println("s1 = " + s1);

//        String str = "www....com";
//        indexOf(String str) 找出字符串中指定字符串的位置
//        int i = str.indexOf(".");
//        System.out.println("i = " + i);
////   indexOf(String str, int fromIndex)  从指定位置开始找字符串中的某个字符串
//        int i1 = str.indexOf(".", 10);
//        System.out.println("i1 = " + i1);
//        int i1 = str.lastIndexOf(".");
//        System.out.println("i1 = " + i1);
////        lastIndexOf(String str, int fromIndex)
//        int i = str.lastIndexOf("w", 8);
//        System.out.println("i = " + i);

        String Str = new String("菜鸟教程:www.runoob.com");
        String SubStr1 = new String("runoob");
        String SubStr2 = new String("com");
        System.out.println("Str.length() = " + Str.length());


        System.out.print("查找字符 o 最后出现的位置 :" );
        System.out.println(Str.lastIndexOf( 'o' ));
        System.out.print("从第14个位置查找字符 o 最后出现的位置 :" );
        System.out.println(Str.lastIndexOf( 'o', 14 ));
        System.out.print("子字符串 SubStr1 最后出现的位置:" );
        System.out.println( Str.lastIndexOf( SubStr1 ));
        System.out.print("从第十五个位置开始搜索子字符串 SubStr1最后出现的位置 :" );
        System.out.println( Str.lastIndexOf( SubStr1, 15 ));
        System.out.print("子字符串 SubStr2 最后出现的位置 :" );
        System.out.println(Str.lastIndexOf( SubStr2 ));






    }


}