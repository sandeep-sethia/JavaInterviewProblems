package com.test.interview;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Arraylist {
    public static void main(String[] args) {
        Set<Integer> test = new HashSet<>();
        test.add(1);
        test.add(2);
        test.add(9);
        test.add(1);
        test.add(2);
        test.add(3);
        test.add(1);
        test.add(4);
        test.add(1);
        test.add(5);
        test.add(7);

        test.stream().forEach(System.out::println);
    }
}
