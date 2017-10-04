package ru.itpark;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final int INITIAL_SIZE = 100

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
                    for (int i = 0; i < INITIAL_SIZE; i++) {
                        System.out.println("Ваш список");
                        lists[listNumber] = scanner.nextInt();
                    }
                    break;
                case 2:
                    if (lists[listNumber] != null)
                        System.out.println(lists[listNumber]);
                    else {
                        System.out.println("Ошибка");
                    }
                    break;
                case 3: {
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
                                lists[listNumber].add(element);
                                System.out.println(lists[listNumber]);
                                break;
                            case 2:
                                System.out.println("Новый элемент в начало:");
                                element = scanner.nextInt();
                                lists[listNumber].addToBegin(element);
                                System.out.println(lists[listNumber]);
                                break;
                            case 3:
                                System.out.println("Новый элемент, нужный индекс");
                                element = scanner.nextInt();
                                int index = scanner.nextInt();
                                lists[listNumber].insert(element, index);
                                System.out.println(lists[listNumber]);
                                break;
                            case 4:
                                System.out.println("Нужный индекс:");
                                index = scanner.nextInt();
                                System.out.println(lists[listNumber].get(index));
                                break;
                            case 5:
                                System.out.println("Нужный индекс, новый элемент:");
                                index = scanner.nextInt();
                                element = scanner.nextInt();
                                lists[listNumber].replace(index, element);
                                System.out.println(lists[listNumber]);
                                break;
                            case 6:
                                lists[listNumber].sort();
                                System.out.println(lists[listNumber]);
                                break;
                            case 7:
                                lists[listNumber].reverse();
                                System.out.println(lists[listNumber]);
                                break;
                            case 8:
                                System.out.println("Индекс удаляемого элемента:");
                                index = scanner.nextInt();
                                lists[listNumber].remove(index);
                                System.out.println(lists[listNumber]);
                                break;
                            case 9:
                                System.out.println("Элемент для поиска:");
                                element = scanner.nextInt();
                                System.out.println(lists[listNumber].find(element));
                                break;
                            default:
                                System.out.println("Ошибка");


                        }
                    }
                }
            }
        }
    }
}
