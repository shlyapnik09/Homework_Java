package ru.mirea.lab8;
//задание 1
public class Subsequence {
    public static void main(String[] args) {
        printSequence(10); // Пример вызова функции с n = 10
    }

    public static void printSequence(int n) {
        if (n <= 0) {
            return; // Базовый случай: достигнуто значение n <= 0, завершаем рекурсию
        }

        printSequence(n - 1); // Рекурсивный вызов функции с уменьшенным значением n

        for (int i = 0; i < n; i++) {
            System.out.print(n + " "); // Выводим текущее значение n
        }
    }
}
