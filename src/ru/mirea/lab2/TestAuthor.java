package ru.mirea.lab2;

public class TestAuthor {
    public static void main(String[] args) {
        Author author1 = new Author("Чехов", "chekhov@mail.com", 'M');
        System.out.println("Данные автора: " + author1);

        author1.setEmail("chekhov@mail.ru");
        System.out.println("Новый email автора: " + author1.getEmail());
    }
}


