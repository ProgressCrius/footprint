package com.jf.footprint.knowledge.java8;

import java.util.Arrays;
import java.util.List;

public class Lambda {


    // 函数式接口
    @FunctionalInterface
    interface Work {
        void workHard(String who);
    }

    public static void main(String[] args) {

        String[] a = {"w", "o", "r", "k"};
        List<String> b = Arrays.asList(a);

        // 之前的遍历方法
        for (String c : b) {
            System.out.println(c);
        }
        // lambda表达式遍历方法
        b.forEach((c) -> System.out.println(c));

        // 双冒号操作符遍历方法
        b.forEach(System.out::println);

    }

}

