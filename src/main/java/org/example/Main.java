package org.example;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(24);
        list1.add(8);
        System.out.println(calc.sum(list1));
        List<Double> list2 = new ArrayList<>();
        list2.add(2.0);
        list2.add(8.9);
        list2.add(90.8);
        System.out.println(calc.multiply(list2));
        List<Double> list3 = new ArrayList<>();
        list3.add(89.1);
        list3.add(2.0);
        list3.add(5.0);
        System.out.println(calc.division(list3));
        calc.binary("219");
        calc.binary("19,6");
    }
}