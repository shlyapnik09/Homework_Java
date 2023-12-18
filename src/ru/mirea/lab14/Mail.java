package ru.mirea.lab14;

public class Mail {
    public static void main(String[] args) {
        String email1 = "user@example.com";
        String email2 = "root@localhost";
        String email3 = "myhost@@@com.ru";
        String email4 = "@my.ru";
        String email5 = "Julia String";

        String regex = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Z|a-z]{2,}$";

        System.out.println(email1 + " is valid: " + email1.matches(regex));
        System.out.println(email2 + " is valid: " + email1.matches(regex));
        System.out.println(email3 + " is valid: " + email3.matches(regex));
        System.out.println(email4 + " is valid: " + email4.matches(regex));
        System.out.println(email5 + " is valid: " + email5.matches(regex));
    }
}

