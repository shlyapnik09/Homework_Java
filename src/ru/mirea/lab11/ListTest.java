package ru.mirea.lab11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ListTest {
    public static void main(String[] args) {
        // Создаем списки ArrayList и LinkedList
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        final int SIZE = 100000; // Размер списка

        // Запускаем тест вставки
        long startTime = System.nanoTime();
        for (int i = 0; i < SIZE; i++) {
            arrayList.add(i);
        }
        long endTime = System.nanoTime();
        System.out.println("ArrayList вставка: " + (endTime - startTime) + " нс");

        startTime = System.nanoTime();
        for (int i = 0; i < SIZE; i++) {
            linkedList.add(i);
        }
        endTime = System.nanoTime();
        System.out.println("LinkedList вставка: " + (endTime - startTime) + " нс");

        // Запускаем тест удаления элементов из середины
        Random rand = new Random();
        int index = SIZE / 2;
        startTime = System.nanoTime();
        arrayList.remove(index);
        endTime = System.nanoTime();
        System.out.println("ArrayList удаление: " + (endTime - startTime) + " нс");

        startTime = System.nanoTime();
        linkedList.remove(index);
        endTime = System.nanoTime();
        System.out.println("LinkedList удаление: " + (endTime - startTime) + " нс");

        // Запускаем тест добавления в середину
        startTime = System.nanoTime();
        arrayList.add(index, 999);
        endTime = System.nanoTime();
        System.out.println("ArrayList добавление: " + (endTime - startTime) + " нс");

        startTime = System.nanoTime();
        linkedList.add(index, 999);
        endTime = System.nanoTime();
        System.out.println("LinkedList добавление: " + (endTime - startTime) + " нс");

        // Запускаем тест поиска элемента
        int searchKey = SIZE - 1;
        startTime = System.nanoTime();
        arrayList.contains(searchKey);
        endTime = System.nanoTime();
        System.out.println("ArrayList поиск: " + (endTime - startTime) + " нс");

        startTime = System.nanoTime();
        linkedList.contains(searchKey);
        endTime = System.nanoTime();
        System.out.println("LinkedList поиск: " + (endTime - startTime) + " нс");
    }
}
