package ru.mirea.lab13;

public class Person {
    private String lastName;
    private String firstName;
    private String middleName;

    public Person(String lastName, String firstName, String middleName) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
    }

    public String getFullName() {
        StringBuilder fullName = new StringBuilder();
        fullName.append(lastName);
        if (firstName != null && !firstName.isEmpty()) {
            fullName.append(" ").append(firstName.charAt(0)).append(".");
        }
        if (middleName != null && !middleName.isEmpty()) {
            fullName.append(" ").append(middleName.charAt(0)).append(".");
        }
        return fullName.toString();
    }

    public static void main(String[] args) {
        Person person1 = new Person("Белянков", "Анатолий", "Олегович");
        Person person2 = new Person("Химич", "Валерия", "");
        Person person3 = new Person("Кукушкин", "", "Анатольевич");

        System.out.println(person1.getFullName());
        System.out.println(person2.getFullName());
        System.out.println(person3.getFullName());
    }
}
