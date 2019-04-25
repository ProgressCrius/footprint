package com.jf.footprint.knowledge.java8;

public class Lambda {


    // 函数式接口
    @FunctionalInterface
    interface Work {
        void workHard(String who);
    }


    public static void main(String[] args) {

        Work work = who -> System.out.println("me" + who);

        work.workHard("en");

    }

}

