package ru.itpark;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList lists[] = new ArrayList[5];

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Меню:\n" +
                    "1. Создать список\n" +
                    "2. Показать все списки\n" +
                    "3. Работа со списком");
            int command = scanner.nextInt();
            switch (command) {
                case 1:
                    System.out.println("Введите номер создаваемого списка: [0..4]");
                    int listNumber = scanner.nextInt();
                    lists[listNumber] = new ArrayList();
                    break;
                case 2:
                    for (int i = 0; i < 5; i++) {
                        if (lists[i] != null)
                            System.out.println(lists[i]);
                        else {
                            System.err.println("Ошибка");
                        }
                    }
                    break;
                case 3: {
                    System.out.println("Номер списка:");
                    int i = scanner.nextInt();
                    while (true) {
                        System.out.println("1. Добавить в конец\n" +
                                "2. Добавить в начало\n" +
                                "3. Вставить элемент в заданную позиции\n" +
                                "4. Получить элемент по индексу\n" +
                                "5. Заменить элемент в заданной позиции новым элементом\n" +
                                "6. Сортировать\n" +
                                "7. Перевернуть\n" +
                                "8. Удалить элемент с указанным индексом\n" +
                                "9. Вернуть индекс элемента");
                        int command2 = scanner.nextInt();
                        switch (command2) {
                            case 1:
                                System.out.println("Новый элемент в конец:");
                                int element = scanner.nextInt();
                                lists[i].add(element);
                                System.out.println(lists[i]);
                                break;
                            case 2:
                                System.out.println("Новый элемент в начало:");
                                element = scanner.nextInt();
                                lists[i].addToBegin(element);
                                System.out.println(lists[i]);
                                break;
                            case 3:
                                System.out.println("Новый элемент, нужный индекс");
                                element = scanner.nextInt();
                                int index = scanner.nextInt();
                                lists[i].insert(element, index);
                                System.out.println(lists[i]);
                                break;
                            case 4:
                                System.out.println("Нужный индекс:");
                                index = scanner.nextInt();
                                System.out.println(lists[i].get(index));
                                break;
                            case 5:
                                System.out.println("Нужный индекс, новый элемент:");
                                index = scanner.nextInt();
                                element = scanner.nextInt();
                                lists[i].replace(index, element);
                                System.out.println(lists[i]);
                                break;
                            case 6:
                                lists[i].sort();
                                System.out.println(lists[i]);
                                break;
                            case 7:
                                lists[i].reverse();
                                System.out.println(lists[i]);
                                break;
                            case 8:
                                System.out.println("Индекс удаляемого элемента:");
                                index = scanner.nextInt();
                                lists[i].remove(index);
                                System.out.println(lists[i]);
                                break;
                            case 9:
                                System.out.println("Элемент для поиска:");
                                element = scanner.nextInt();
                                System.out.println(lists[i].find(element));
                                break;
                            default:
                                System.err.println("Ошибка");


                        }
                    }
                }
            }
        }
    }
}
