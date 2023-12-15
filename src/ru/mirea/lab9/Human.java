package ru.mirea.lab9;
//класс человек с именем и GPA
class Human {
    private String name;
    private double gpa;

    public Human(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public double getGPA() {
        return gpa;
    }
}