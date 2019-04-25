package com.jf.footprint.knowledge.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {

    public static Stream getStream(int a) {

        switch (a) {
            case 1:
                // 直接从值生成Stream
                Stream stream1 = Stream.of(5, 2, 7, 9, 11, 8);
                return stream1;
            case 2:
                // 数组生成Stream
                String[] strings = {"ab", "bc", "", "cd", "", "fg"};
                Stream stream2 = Stream.of(strings);
                // Stream stream3 = Arrays.stream(strings);
                return stream2;
            case 3:
                // 从集合生成Stream
                String[] string2 = {"ab", "ac", "bd", "cd", "cg",};
                List<String> stringList = Arrays.asList(string2);
                Stream stream4 = stringList.stream();
                return stream4;

            default:
        }
        return Stream.of();

    }


    public static void main(String[] args) {

        // filter方法用于通过设置的条件过滤出元素。
        Stream<String> s1 = getStream(2);
        long b = s1.filter(a -> a.isEmpty()).count();
        System.out.println(b);
    }


}
