package ru.mirea.lab11;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DateTimeInput {
    public static void main(String[] args) {
        // Ввод данных пользователем
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год:");
        int year = scanner.nextInt();
        System.out.println("Введите месяц (1-12):");
        int month = scanner.nextInt() - 1; // месяцы в Calendar начинаются с 0
        System.out.println("Введите день месяца:");
        int day = scanner.nextInt();
        System.out.println("Введите часы (0-23):");
        int hour = scanner.nextInt();
        System.out.println("Введите минуты:");
        int minute = scanner.nextInt();

        // Формирование объекта Date
        Date date = new Date(year - 1900, month, day, hour, minute);
        System.out.println("Объект Date: " + date);

        // Формирование объекта Calendar
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, day, hour, minute);
        System.out.println("Объект Calendar: " + calendar.getTime());
    }
}
