package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите любое целочисленное 5-ти значное число: ");
        int number = sc.nextInt();
        int temp;
        for (int i = 10000; i > 0; i = i / 10) {
            temp = number - (number % i);
            number = number - temp;
            System.out.println(temp / i);
        }

    }
}
