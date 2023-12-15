package ru.mirea.lab9;

public class Student {
    private int iDNumber;
    private String name;

    public Student(int iDNumber, String name){
        this.iDNumber = iDNumber;
        this.name = name;
    }

    public int getiDNumberD() {
        return iDNumber;
    }

    public String getName() {
        return name;
    }
}
