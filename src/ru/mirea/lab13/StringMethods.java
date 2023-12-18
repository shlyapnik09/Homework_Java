package ru.mirea.lab13;

public class StringMethods {
    public static void main(String[] args) {
        String str = "I like Java!!!";

        // Распечатать последний символ строки
        char lastChar = str.charAt(str.length()-1);
        System.out.println("Последний символ строки: " + lastChar);

        // Проверить, заканчивается ли строка подстрокой "!!!"
        boolean endsWithExclamation = str.endsWith("!!!");
        System.out.println("Заканчивается ли строка на '!!!'? " + endsWithExclamation);

        // Проверить, начинается ли строка подстрокой "I like"
        boolean startsWithILike = str.startsWith("I like");
        System.out.println("Начинается ли строка с 'I like'? " + startsWithILike);

        // Проверить, содержит ли строка подстроку "Java"
        boolean containsJava = str.contains("Java");
        System.out.println("Содержит ли строка 'Java'? " + containsJava);

        // Найти позицию подстроки "Java" в строке
        int positionOfJava = str.indexOf("Java");
        System.out.println("Позиция подстроки 'Java' в строке: " + positionOfJava);

        // Заменить все символы "а" на "о"
        String replacedString = str.replace('a', 'o');
        System.out.println("Строка после замены: " + replacedString);

        // Преобразовать строку к верхнему регистру
        String upperCaseString = str.toUpperCase();
        System.out.println("Строка в верхнем регистре: " + upperCaseString);

        // Преобразовать строку к нижнему регистру
        String lowerCaseString = str.toLowerCase();
        System.out.println("Строка в нижнем регистре: " + lowerCaseString);

        // Вырезать подстроку "Java"
        String newString = str.substring(7, 11);
        System.out.println("Вырезанная подстрока: " + newString);
    }
}

