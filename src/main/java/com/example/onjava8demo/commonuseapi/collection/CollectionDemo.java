package com.example.onjava8demo.commonuseapi.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

/**
 * 描述:
 *
 * @author xuliang
 * @create 2019-09-25 11:32
 */
public class CollectionDemo {
    public static void main(String[] args) {
//        java.util.Collection<E>
//        Iterator<E> iterator () 返回一个用于访问集合中每个元素的迭代器
//        int size () 返回当前存储在集合中的元素个数
//        boolean isEmpty () 如果集合中没有元素，返回true
//        boolean contains (Object obj)
//        boolean containAll (Collection < ? extend E > other)如果集合中包含相等对象，返回true
//        boolean add (Object element)
//        boolean addAll (Collection < ? extend E > other)将一个元素添加到集合中，集合改变返回true
//        boolean remove (Object element)
//        boolean removeAll (Collection < ? > other)删除相等元素，成功删除返回true


        Collection<String> collection = new ArrayList<>();
        Collection<String> collection1 = new ArrayList<>();
        collection.add("001");
        collection1.add("001");
        collection.add("003");
        collection1.add("003");
        collection.add("002");
        collection1.add("002");
        collection.add("009");
        collection1.add("009");
        collection.add("006");
        collection1.add("006");
        collection1.add("0010");


/*
        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            System.out.println("next = " + next);
        }
        int size = collection.size();
        System.out.println("size = " + size);
        boolean empty = collection.isEmpty();
        System.out.println("empty = " + empty);
*/
/*
        boolean contains = collection.contains("005");
        System.out.println("contains = " + contains);
*/
/*
        boolean b = collection.containsAll(collection1);
        System.out.println("b = " + b);

*/
/*
        boolean b = collection.addAll(collection1);
        System.out.println("b = " + b);
        collection.forEach(System.out::println);*/


        Iterator<String> iterator = collection.iterator();
         while (iterator.hasNext()){
             String next = iterator.next();
             if (Objects.equals(next,"001")){
                 iterator.remove();
             }
         }

         collection.forEach(System.out::println);

    }

}