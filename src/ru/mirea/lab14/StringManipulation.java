package ru.mirea.lab14;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringManipulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку для манипуляции:");
        String inputString = scanner.nextLine();

        System.out.println("Выберите операцию (1-разбить по пробелам, 2-найти все числа, 3-найти все слова):");
        int operation = scanner.nextInt();

        switch (operation) {
            case 1:
                splitBySpaces(inputString);
                break;
            case 2:
                findAllNumbers(inputString);
                break;
            case 3:
                findAllWords(inputString);
                break;
            default:
                System.out.println("Неправильная операция");
        }
    }
    // метод для разбиения пробелами
    private static void splitBySpaces(String inputString) {
        String[] words = inputString.split("\\s+");
        for (String word : words) {
            System.out.println(word);
        }
    }
    // метод для нахождения чисел
    private static void findAllNumbers(String inputString) {
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(inputString);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
    // метод для нахождения слов
    private static void findAllWords(String inputString) {
        Pattern pattern = Pattern.compile("\\b\\w+\\b");
        Matcher matcher = pattern.matcher(inputString);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
