package ru.itpark;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = new int[100];
        int count = 0;
        int i;

        for (i = 0; i < 100; i++)        {
            System.out.println("Введите число");
            a[i] = sc.nextInt();
            count++;
            break;
        }

        for (i = 0; i < 100; i++) {

            System.out.println("1. Показать массив\n" +
                    "2. Добавить в начало\n" +
                    "3. Добавить в конец\n" +
                    "4. Удалить по позиции\n" +
                    "5. Выход");
            break;
        }

        while (true) {
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    for (i = 0; i < count; i++)
                        System.out.println("[" + a[i] + "]");
                    break;
                case 2:
                    System.out.println("Новый элемент:");
                    int ad = sc.nextInt();
                    for (i = 0; i < count; i++)
                        ad = a[0];
                    a[i] = a[i + 1];
                    count++;
                    System.out.println("[" + a[i] + "]");
                    break;
                case 3:
                    System.out.println("Новый элемент:");
                    a[i + 1] = sc.nextInt();
                    System.out.println("[" + a[i] + "]");
                    break;
                case 4:
                    System.out.println("Номер позиции:");
                    int n = sc.nextInt();
                    for (i = (n - 1); i < count - 1; i++)
                        a[i] = a[i + 1];
                    count--;
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
