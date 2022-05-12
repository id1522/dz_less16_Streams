package com.company;
import java.util.*;


public class Main {

    public static void main(String[] args) {
        List <Integer> numbers = new Random().ints(10,7,17).boxed().toList();
        System.out.println("Random element insert"+numbers);
        System.out.println("sheet contains elements: "+ (long) numbers.size());
        System.out.println("duplicate delete: "+numbers.stream().distinct().toList());
        for (String s : Arrays.asList(
                "multiplication for 2: " + numbers.stream().map((a) -> a * 2).toList(),
                "after sorted 4 first element: " +numbers.stream().sorted().distinct().limit(4).toList(),
                "Maths arithmetic operation: " + numbers.stream().mapToInt( (a) -> a ).average(),
                "even numbers 7 - 17: " + numbers.stream().filter(o -> o % 2 == 0).toList())) {
            System.out.println(s);
        }
    }
}