package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        int element = 10;
        ArrayList<Integer> integer = new ArrayList<>(element);
        for (int i = 0; i < element; i++) {
            int a = (int) (Math.random() * 10 +7);
            integer.add(a);
        }
        System.out.println("Random element insert"+integer);
        System.out.println("sheet contains elements: "+ (long) integer.size());
        System.out.println("duplicate delete: "+integer.stream().distinct().toList());
        for (String s : Arrays.asList(
                "multiplication for 2: " + integer.stream().map((a) -> a * 2).toList(),
                "after sorted 4 first element: " + integer.stream().sorted().distinct().limit(4).toList(),
                "Maths arithmetic operation: " + integer.stream().mapToInt((a) -> Integer.parseInt(String.valueOf(a))).average(),
                "even numbers 7 - 17: " + integer.stream().filter(o -> o % 2 == 0).toList())) {
            System.out.println(s);
        }
    }
}