package ru.mirea.lab9;

public class TesterStudent {
    public static void main(String[] args) {
        Student[] students;
        students = new Student[5];
        students[0] = new Student("Belyankov Anatoli", 332424);
        students[1] = new Student("Kirienko Kirill", 463463);
        students[2] = new Student("Ryazancheva Varvara", 123456);
        students[3] = new Student("Kykyshkin Matvey", 564783);
        students[4] = new Student("Belyankov Oleg", 732890);
    };


    public static void insertionSort(Student[] array) {
        for (int i = 1; i < array.length; i++) {
            Student key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j].compareTo(key) > 0) {
                array[j + 1] = array[j];
                j--;
            }

            array[j + 1] = key;


        }
    }
}

