package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите два числа");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("1. Считать два числа\n" +
                "2. Сумма двух чисел\n" +
                "3. Разность двух чисел\n" +
                "4. Произведение двух чисел\n" +
                "5. Выход");

        while (true) {
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Вы ввели " + a + " и " + b);
                    break;
                case 2:
                    System.out.println(a + " + " + b + " = " + (a + b));
                    break;
                case 3:
                    System.out.println(a + " - " + b + " = " + (a - b));
                    break;
                case 4:
                    System.out.println(a + " * " + b + " = " + (a * b));
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Неверно");
            }
        }
    }
}