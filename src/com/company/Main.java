package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите число месяцев: ");
        int n = in.nextInt();

        Scanner in2 = new Scanner(System.in);
        System.out.println("Введите число пар: ");
        int k = in2.nextInt();

        long fib1 = 1;
        long fib2 = 1;

        int i = 0;

        while (i < n - 2) {
            long fib_sum = fib2 + (fib1 * k);
            fib1 = fib2;
            fib2 = fib_sum;
            i = i + 1;
        }
        System.out.println("Число пар кроликов при " + n + " месяцев при коэффициенте размножения " +  k + " равно " + fib2);
    }
}
