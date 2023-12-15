package ru.mirea.lab11;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Scanner;

public class DateComparison {
    public static void main(String[] args) {
        Date currentDate = new Date(); // текущая дата
        System.out.println("Текущая системная дата и время: " + currentDate);

        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        System.out.println("Введите дату и время(dd/MM/yyyy HH:mm:ss):");
        String inputDateStr = scanner.nextLine();

    //конструкцию try-catch используем для обработки исключение, возникшего при ошибке обработать данные ввёдённые пользователем
        try {
            Date inputDate = dateFormat.parse(inputDateStr);//parse метод преобразования введённого пользователем в объект Date

            if (inputDate.after(currentDate)) {
                System.out.println("Введённые дата и время находятся в будущем");
            } else if (inputDate.before(currentDate)) {
                System.out.println("Введённые данные находятся в прошлом");
            } else {
                System.out.println("Введенные дата и время совпадают с текущими датой и временем");
            }
        }
        catch (ParseException e) {
            System.out.println("Неверно введена дата");
        }
    }
}