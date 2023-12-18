package ru.mirea.lab14;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Plus{
    public static boolean hasNumbersAfterPlus(String input) {
        int index = input.indexOf("+");

        if (index != -1 && index < input.length() - 1) { // проверяем, что знак "+" есть и не является последним символом строки
            String substring = input.substring(index + 1); // получаем подстроку после символа "+"
            for (char c : substring.toCharArray()) {
                if (Character.isDigit(c)) {
                    return true; // если находим хотя бы одну цифру, возвращаем true
                }
            }
        }
        return false; // если не находим цифр после "+", возвращаем false
    }

    public static void main(String[] args) {
        String input1 = "abc+123"; // пример строки с числом после "+"
        String input2 = "def+xyz"; // пример строки без числа после "+"

        System.out.println(hasNumbersAfterPlus(input1)); // выводит true, т.к. есть цифры после "+"
        System.out.println(hasNumbersAfterPlus(input2)); // выводит false, т.к. нет цифр после "+"
    }
}
