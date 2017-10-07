package ru.itpark;

public class ArrayList {

    private final int INITIAL_SIZE = 100;
    private int elements[];
    private int count;

    public ArrayList() {
        elements = new int[INITIAL_SIZE];
        count = 0;
    }

    public void add(int element) {
        if (count < elements.length) {
            elements[count] = element;
            count++;
        } else {
            System.err.println("Нет места");
        }
    }


    public void addToBegin(int element) {
        element = elements[0];
        for (int i = 0; i < count; i++) {
            elements[i] = elements[i + 1];
            count++;
        }
    }


    public void insert(int element, int index) {
        element = elements[index];
        for (int i = count - index; i < count; i++) {
            elements[count - index] = elements[count - index + 1];
            count++;
        }
    }


    public int get(int index) {
        if (elements[index] != 0)
            return elements[index];
        else {
            return -1;
        }
    }


    public void replace(int index, int element) {
        elements[index] = element;

    }

    public void sort() {
        for (int i = 0; i < elements.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < elements.length; j++) {
                if (elements[j] < elements[i])
                    min = j;
            }
            int temp = elements[min];
            elements[min] = elements[i];
            elements[i] = temp;
        }
    }

    public void reverse() {
        for (int i = 0; i < count / 2; i++) {
            int temp = elements[i];
            elements[i] = elements[count - 1 - i];
            elements[count - 1 - i] = temp;
        }
    }


    public void remove(int index) {
        for (int i = index + 1; i < count; i++) {
            elements[index] = elements[index - 1];
            count--;
        }
    }


    public int find(int element) {
        for (int i = 0; i < count; i++) {
            if (elements[i] == element) {
                return i;
            }
        }      return -1;


        }
    }


