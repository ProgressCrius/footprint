package com.jf.footprint.knowledge.algorithm;


// 递归算法
public class Recursion {

    // 递归求和
    public static int sum(int num) {
        if (num > 0) {

            return num + sum(num - 1);
            // 调用递归方法
        } else {
            num = 100;
            System.out.println("子轮的num不影响父轮的num,也不影响其他轮num:" + num);
            // 当num=0时，结束
            return 0;

        }
    }


    public static void main(String[] args) {
        // 求1到10的和
        System.out.println(sum(10));
    }
}
