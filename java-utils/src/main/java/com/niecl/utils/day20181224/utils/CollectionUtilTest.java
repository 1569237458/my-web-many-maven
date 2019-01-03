package com.niecl.utils.day20181224.utils;

import com.niecl.utils.day20181224.pojo.Todo;

import java.util.ArrayList;
import java.util.List;

/**
 * @authar nieChenLiang
 * @date 2018-12-24 15:59
 */
public class CollectionUtilTest {
    public static void main(String[] args) {
        CollectionUtil cu = new CollectionUtil();
        /**
         * String[] arrayA = new String[] { "A", "B", "C", "D", "E", "F" };
         String[] arrayB = new String[] { "B", "D", "F", "G", "H", "K" };
         List<String> listA=Arrays.asList(arrayA);
         List<String> listB=Arrays.asList(arrayB);
         JSONArray jsonA = JSONArray.fromObject(listA);
         JSONArray jsonB = JSONArray.fromObject(listB);
         */
        List<Todo> listA = new ArrayList<Todo>();
        List<Todo> listB = new ArrayList<Todo>();
        init(listA, listB);
//        List<String> unionList = cu.Union(listA, listB);
//        List<String> isList=cu.Intersection(listA,listB);
//        List<String> djList=cu.Disjunction(listA,listB);
        List<String> subList = cu.Subtract(listA, listB);
        for (String str : subList) {
            System.out.println(str);
        }

        System.out.println(cu.EqualsList(listA, listB));

//        cu.testUnmodifiableCollection();
    }


    private static void init(List<Todo> listA, List<Todo> listB) {
        listA.add(new Todo("001", "001", "张三", "001"));
        listA.add(new Todo("002", "001", "李四", "001"));
        listB.add(new Todo("001", "001", "张三", "001"));
        listB.add(new Todo("003", "001", "王五", "001"));
    }
}
