package ru.itpark;

import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
		int[] array1 = new int[100];
		int[] array2 = sortInsert(array1[]);
		int[] array3 = addToTheBeginning(array1[], int ad);
		int[] array4 = deleteThePosition(array1[], int num);


		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < array1.length; i++) {
			System.out.println("Введите число");
			array1[i] = sc.nextInt();
		}

		System.out.println("1. Показать массив\n" +
				"2. Добавить в начало\n" +
				"3. Добавить в конец\n" +
				"4. Удалить по позиции\n" +
				"5. Сортировать\n" +
				"6. Выход");

				while (true) {
			int choice = sc.nextInt();
			switch (choice) {
				case 1:
					for (int i = 0; i < array1.length; i++) {
						System.out.println("[" + array1[i] + "]");
					}
				case 2:
					System.out.println("Новый элемент:");
					ad = sc.nextInt();
					for (int el: array3) {
						System.out.println(el);
					}
				case 3:
					for (int i = 0; i < array1.length; i++) {
						System.out.println("Новый элемент:");
						array1[i + 1] = sc.nextInt();
						System.out.println("[" + array1[i] + "]");
					}
				case 4:
					for (int i = 0; i < array1.length; i++) {
						System.out.println("Номер позиции");
						num = sc.nextInt();
						for (int pos: array4) {
							System.out.println(pos);
						}
					}
				case 5:
					for (int ch: array2) {
						System.out.println(ch);
					}
				case 6:
					System.exit(0);
					break;
			}

						}
		}

		public static void addToTheBeginning (int[] a, int nev) {
    		for (int i = 0; i < a.length; i++) {
    			nev = a[0];
    			a[i] = a[i+1];
    					}
	}

	public static void deleteThePosition (int[] a, int n) {
    	for (int i = (n-1); i < a.length-1; i++) {
    		a[i] = a[i+1];
		}
	}

	 public static void sortInsert(int[] a) {
	     int temp;
	     for (int i = 1; i < a.length; i++) {
	         for (int j = i; j > 0; j--) {
	             if(a[j] < a[j-1]) {
	                 temp = a[j];
	                 a[j] = a[j-1];
	                 a[j-1] = temp;

                 }

             }
         }

    }

    }






