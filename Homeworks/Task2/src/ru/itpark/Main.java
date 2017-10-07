package ru.itpark;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = new int[100];
        int count = 0;
        int i;

        System.out.println("1. Показать массив\n" +
                "2. Добавить в начало\n" +
                "3. Добавить в конец\n" +
                "4. Удалить по позиции\n" +
                "5. Выход");

        while (true) {
                int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    for (i = 0; i < count; i++) {
                        System.out.println("[" + a[i] + "]");
                    }
                    break;
                case 2:
                    System.out.println("Новый элемент:");
                    int addition = sc.nextInt();
                    for (i = 0; i < count; i++) {
                        addition = a[0];
                        a[i] = a[i + 1];
                        count++;
                    }
                        System.out.println("[" + a[i] + "]");

                    break;
                case 3:
                    System.out.println("Новый элемент:");
                    addition = sc.nextInt();
                        for (i = 0; i < count; i++) {
                        addition = a[i + 1];
                        count++;
                    }
                     System.out.println("[" + a[i] + "]");
                    break;
                case 4:
                    System.out.println("Номер позиции:");
                    int n = sc.nextInt();
                    a[n] = 0;
                    for (i = (n + 1); i < count; i++) {
                        a[i] = a[i - 1];
                        count--;
                    }
                    System.out.println("[" + a[i] + "]");
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Ошибка");


            }
        }


    }
}
