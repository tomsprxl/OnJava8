package com.example.onjava8demo.commonuseapi.collection.collection001;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/**
 * 描述:
 *
 * @author xuliang
 * @create 2019-09-25 13:38
 */
public class CollectionDemo002 {
    public static void main(String[] args) {
        Collection collection = new ArrayList(Arrays.asList(1, 2, 3, 4, 6, 99, 0, 44, 66, 77, 2, 6));
        Comparable max = Collections.max(collection);
        System.out.println("max = " + max);

        Comparable min = Collections.min(collection);
        System.out.println("min = " + min);









    }

}