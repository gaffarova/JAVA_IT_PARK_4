package ru.itpark;

import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        int[] array = new int[100];
        int count = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println
                ("1. Показать массив\n" +
                        "2. Добавить в начало\n" +
                        "3. Добавить в конец\n" +
                        "4. Удалить по позиции\n" +
                        "5. Сортировать\n" +
                        "6. Выход");

        while (true) {
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    show(array, count);
                    break;
                case 2:
                    System.out.println("Новый элемент:");
                    int addition = sc.nextInt();
                    addToBegin(array, addition, count);
                    System.out.println(array);
                    break;
                case 3:
                    System.out.println("Новый элемент:");
                    addition = sc.nextInt();
                    addToEnd(array, addition, count);
                    System.out.println(array);
                    break;
                case 4:
                    System.out.println("Номер позиции");
                    int number = sc.nextInt();
                    deleteThePosition(array, number, count);
                    System.out.println(array);
                    break;
                case 5:
                    sortByInsertion(array, count);
                    System.out.println(array);
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.err.println("Ошибка");
            }

        }

    }

    public static void show(int[] array, int count) {
        if (count == 0) {
            System.out.println("Список пуст");
        } else {
            for (int i = 0; i < count; i++) {
                System.out.println("[" + array[i] + "]");
            }
        }
    }

    public static void addToBegin(int[] array, int addition, int count) {
        if (count >= 100) {
            System.out.println("Нет места");
        } else {
            for (int i = 0; i < count; i++) {
                array[i] = array[i + 1];
            }
            array[0] = addition;
            count++;
        }
    }

    public static void addToEnd(int[] array, int addition, int count) {
        if (count >= 100) {
            System.out.println("Нет места");
        } else {
            array[count] = addition;
            count++;
        }
    }

    public static void deleteThePosition(int[] array, int number, int count) {
        array[number] = 0;
        for (int i = number - 1; i < count; i++) {
            array[i] = array[i + 1];
        }
        count--;
    }

    public static void sortByInsertion(int[] array, int count) {
        if (count == 0) {
            System.out.println("Список пуст");
        } else {
            int temp;
            for (int i = 1; i < count; i++) {
                for (int j = i; j > 0; j--) {
                    if (array[j] < array[j - 1]) {
                        temp = array[j];
                        array[j] = array[j - 1];
                        array[j - 1] = temp;

                    }

                }
            }

        }

    }
}