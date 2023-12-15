package ru.mirea.lab11;

import java.util.Date;
public class Information {
    public static void main(String[] args) {
        String developerLastName = "Belyankov"; // введите здесь фамилию разработчика
        Date startDate = new Date();  // текущая дата и время

        // Ваш код здесь
        // выведите дату и время получения задания
        System.out.println("Developer: " + developerLastName);
        System.out.println("Start date: " + startDate);

        // выполнение работы

        Date endDate = new Date();  // текущая дата и время, когда завершена работа
        // выведите дату и время сдачи задания
        System.out.println("End date: " + endDate);
    }
}
