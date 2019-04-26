package com.jf.footprint.utils;

import java.util.Arrays;

public class SortUtil {

    // 冒泡排序  时间复杂度为：O(n2)  空间复杂度：O(1)
    public static void bubbleSort(int[] array) {

        int temp;
        for (int i = 0; i < array.length - 1; i++) {

            // 当前轮大数不断右移，直到最大数移到当前轮的最右面
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j + 1] < array[j]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }


    // 简单选择排序(直接选择排序)   时间复杂度为：O(n2)  空间复杂度：O(1)
    public static void selectionSort(int[] array) {

        int index;
        for (int i = 1; i < array.length; i++) {

            // 在下标为0到array.length-i这几个数中，选出最大的数
            index = 0;
            for (int j = 1; j <= array.length - i; j++) {
                if (array[j] > array[index]) {
                    index = j;
                }
                // 将下标为0到array.length-i这几个数中的最大数放到array.length-i这个下标处
                if (index != array.length - i) {
                    int temp = array[array.length - i];
                    array[array.length - i] = array[index];
                    array[index] = temp;
                }
            }

        }
    }


    // 快速排序  时间复杂度为：O(n2)  空间复杂度：O(log n)
    public static void quickSort(int[] array, int low, int high) {
        int i, j, temp, t;
        if (low > high) {
            return;
        }
        i = low;
        j = high;
        // temp是基准位
        temp = array[low];

        while (i < j) {
            //先看右边，依次往左递减
            while (temp <= array[j] && i < j) {
                j--;
            }
            //再看左边，依次往右递增
            while (temp >= array[i] && i < j) {
                i++;
            }
            //如果满足条件则交换
            if (i < j) {
                t = array[j];
                array[j] = array[i];
                array[i] = t;
            }

        }
        //最后将基准为与i和j相等位置的数字交换
        array[low] = array[i];
        array[i] = temp;
        //递归调用左半数组
        quickSort(array, low, j - 1);
        //递归调用右半数组
        quickSort(array, j + 1, high);
    }

    public static void main(String[] args) {

        int[] array = new int[]{5, 3, 7, 15, 1, 9, 6, 11, 8};
        System.out.println(Arrays.toString(array));
        bubbleSort(array);
        selectionSort(array);
        quickSort(array, 0, array.length - 1);

        // 数组是引用传递
        System.out.println(Arrays.toString(array));

    }

}



