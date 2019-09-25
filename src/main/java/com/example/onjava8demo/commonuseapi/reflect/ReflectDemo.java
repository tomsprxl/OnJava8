package com.example.onjava8demo.commonuseapi.reflect;

/**
 * 描述:
 *
 * @author xuliang
 * @create 2019-09-24 15:41
 */
public class ReflectDemo {
    public static void main(String[] args) throws ClassNotFoundException {
//        java.lang.Class
// 
//        String getName()	返回这个类的名字
//        static Class forName(String className)	返回描述类名为className的Class对象
//        Object newInstance()	返回这个类的一个新实例
//        Field[] getFields()
//        Field[] getDeclareFields()	getFields()返回一个包含Field对象的数组，这些对象记录了这个类或其超类的公有域
//        getDeclareFields()返回的Field对象记录了这个类的全部域
//        Method[] getMethods()
//        Method[] getDeclareMethods()	getMethods()返回一个包含Method对象的数组，这些对象记录了这个类或其超类的公用方法
//        getDeclareMethods()返回的Field对象记录了这个类的全部方法
//        Constructor[] getConstructors()
//        Constructor[] getDeclareConstructors()	getConstructors()返回一个包含Constructor对象的数组，这些对象记录了这个类的公有构造器
//        getDeclareConstructors()返回的Constructor对象记录了这个类的全部构造器

        Class<?> reflectDemo = Class.forName("ObjectDemo");
        String name = reflectDemo.getName();
        System.out.println("name = " + name);


    }

}