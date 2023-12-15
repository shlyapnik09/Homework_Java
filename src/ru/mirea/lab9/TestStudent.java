package ru.mirea.lab9;

public class TestStudent {
    //сортировка вставками
    public static void insertionSort(Student[] students) {
        for (int i = 1; i < students.length; i++) {
            Student key = students[i];
            int j = i - 1;
            while (j >= 0 && students[j].getiDNumberD() > key.getiDNumberD()) {
                students[j + 1] = students[j];
                j--;
            }
            students[j + 1] = key;
        }
    }
    public static void printStudents(Student[] students) {
        for (Student student : students) {
            System.out.println("ID: " + student.getiDNumberD() + ", Name: " + student.getName());
        }
    }
    public static void main(String[] args) {
        Student[] students = {
                new Student(534, "Kirill"),
                new Student(221, "Anatoliy"),
                new Student(766, "Oleg"),
                new Student(302, "Varvara"),
                new Student(121, "Matvey")
        };
        System.out.println("Не отсортированные студенты:");
        printStudents(students);

        insertionSort(students);

        System.out.println("\nОтсортированные студенты по id:");
        printStudents(students);
    }
}

