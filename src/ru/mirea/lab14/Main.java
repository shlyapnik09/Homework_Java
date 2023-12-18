package ru.mirea.lab14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String text = "1. 25.98 USD\n" +
                "2. 44 ERR\n" +
                "3. 15.50 RUB\n" +
                "4. 0.004 EU\n" +
                "5. 60.00 USD\n" +
                "6. 1200.00 RUB\n" +
                "7. 35.75 EU";

        Pattern pattern = Pattern.compile("\\d+\\.?\\d*\\s(USD|RUB|EU)");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
