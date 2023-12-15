package ru.mirea.lab9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static List<String> mergeSortedLists(List<String> list1, List<String> list2) {
        List<String> mergedList = new ArrayList<>();
        int i = 0;
        int j = 0;

        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i).compareTo(list2.get(j)) < 0) {
                mergedList.add(list1.get(i));
                i++;
            } else {
                mergedList.add(list2.get(j));
                j++;
            }
        }

        while (i < list1.size()) {
            mergedList.add(list1.get(i));
            i++;
        }

        while (j < list2.size()) {
            mergedList.add(list2.get(j));
            j++;
        }

        return mergedList;
    }

    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("Anatoli");
        list1.add("Kirill");
        list1.add("Eva");

        List<String> list2 = new ArrayList<>();
        list2.add("Liza");
        list2.add("Oleg");
        list2.add("Nikita");

        Collections.sort(list1);
        Collections.sort(list2);

        List<String> sortedMergedList = mergeSortedLists(list1, list2);

        for (String student : sortedMergedList) {
            System.out.println(student);
        }
    }
}