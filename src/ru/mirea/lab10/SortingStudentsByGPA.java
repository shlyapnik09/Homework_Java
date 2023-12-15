package ru.mirea.lab10;

import java.util.Arrays;
import java.util.Comparator;

public class SortingStudentsByGPA {
    private People[] students;

    public void setArray(People[] students) {
        this.students = students;
    }
    // сортируем по убыванию
    public void quicksort() {
        Arrays.sort(students, Comparator.comparingInt((People s) -> s.gpa).reversed());
    }
    public void outArray() {
        for (People student : students) {
            System.out.println("ID: " + student.iDNumber + ", GPA: " + student.gpa);
        }
    }

    public static void main(String[] args) {
        People[] students = {
                new People(1, 3),
                new People(2, 4),
                new People(3, 2),
                new People(4, 5),
                new People(5, 1)
        };

        SortingStudentsByGPA sorter = new SortingStudentsByGPA();
        sorter.setArray(students);
        sorter.quicksort();
        sorter.outArray();
    }
}
