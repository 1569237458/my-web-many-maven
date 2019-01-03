package com.niecl.utils.lambda;

import java.util.Arrays;
import java.util.List;

/**
 * @authar nieChenLiang
 * @date 2018-12-28 15:34
 */
public class demo1 {
    public static void main(String[] args) {
//        createThread();
        forList();

    }


    //    遍历List集合
    private static void forList() {
        List<String> strings = Arrays.asList("a", "b", "c");
        for (String s : strings) {
            System.out.print(s+"  ");
        }
    }


    //创建线程
    public static void createThread() {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello");
            }
        });
        thread.start();
        //java 8
        Thread thread1 = new Thread(() -> System.out.println("hello lambda"));
        thread1.start();
    }


}
