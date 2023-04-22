package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Calculator {
    public Double sum(List<? extends Number> list) {
        Double sum = 0.0;
        for (Number num: list) {
            sum += num.doubleValue();
        }
        return sum;
    }

    public Double multiply(List<? extends Number> list) {
        Double mult = 1.0;
        for (Number num: list) {
            mult *= num.doubleValue();
        }
        return mult;
    }

    public Double division(List<? extends Number> list) {
        Double div = list.get(0).doubleValue();
        for (Number num: list) {
            div /= num.doubleValue();
        }
        return div;
    }

    private List<Integer> binaryInt(int num) {
        List<Integer> binary = new ArrayList<>();
        while (num > 0) {

            binary.add(num % 2);
            num /= 2;
        }
        return binary;
    }

    public String binary(String b) {
        String[] firstArr = b.split(",");
        if (firstArr.length == 1) {
            b = convertToString(binaryInt(Integer.parseInt(firstArr[0])));
        }
        else {
            b = convertToString(binaryDouble(firstArr));
        }
        System.out.println(b);
        return b;
    }

    private List<String> binaryDouble(String[] firstArr) {
        List<String> newBinary = new ArrayList<>();
        newBinary.add(convertToString(reverseBinary(binaryInt(Integer.parseInt(firstArr[0])))));
        String decimal = "0." + firstArr[1];
        newBinary.add(",");
        newBinary.add(convertDecimal(Double.parseDouble(decimal)));
        return newBinary;
    }

    private String convertToString(List<?> elements) {
        return elements.stream().map(Object::toString)
                .collect(Collectors.joining(""));
    }

    private List<Integer> reverseBinary(List<Integer> binary) {
        List<Integer> newBinary = new ArrayList<>();
        for (int i = binary.toArray().length - 1; i > 0; i--) {
            newBinary.add(binary.get(i));
        }
        return newBinary;
    }

    private String convertDecimal(double num) {
        List<Integer> decimalBinary = new ArrayList<>();
        int whole = 0;
        while (whole == 0) {
            num *= 2;
            whole = (int) num;
            decimalBinary.add(whole);
        }
        return convertToString(decimalBinary);
    }
}
