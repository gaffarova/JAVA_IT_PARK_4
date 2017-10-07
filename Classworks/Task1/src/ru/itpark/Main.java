package ru.itpark;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите размер массива");
        int size = scanner.nextInt();
        int array[] = new int[size];

        System.out.println("Введите числа");

        for (int i = 0; i < size; i++)
            array[i] = scanner.nextInt();

        for (int i = 0; i < size; i++) {
            if (array[i] % 2 == 0)
                array[i] = 0;
            System.out.println(array[i]);
        }

    }
}
