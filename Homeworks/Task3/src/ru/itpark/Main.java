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
                    for (int i = 0; i < count; i++) {
                        System.out.println("[" + array[i] + "]");
                    }
                    break;
                case 2:
                    System.out.println("Новый элемент:");
                    int addition = sc.nextInt();
                    addToTheBeginning(array, addition, count);
                    count++;
                    System.out.println(array);
                    break;
                case 3:
                    System.out.println("Новый элемент:");
                    addition = sc.nextInt();
                    addToTheEnd(array, addition, count);
                    count++;
                    System.out.println(array);
                    break;
                case 4:
                    System.out.println("Номер позиции");
                    int number = sc.nextInt();
                    deleteThePosition(array, number, count);
                    count--;
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

    public static void addToTheBeginning(int[] array, int addition, int count) {
        for (int i = 0; i < count; i++) {
            addition = array[0];
            array[i] = array[i + 1];
        }
    }

    public static void addToTheEnd(int[] array, int addition, int count) {
        for (int i = 0; i < count; i++) {
            addition = array[i + 1];
        }
    }

    public static void deleteThePosition(int[] array, int number, int count) {
        for (int i = number - 1; i < count - 1; i++) {
            array[number] = 0;
            array[i] = array[i + 1];
        }
    }

    public static void sortByInsertion(int[] array, int count) {
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






