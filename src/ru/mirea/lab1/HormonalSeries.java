package ru.mirea.lab1;

import java.security.spec.RSAOtherPrimeInfo;

//задание 6
public class HormonalSeries {
    public static void main(String[] args) {
        System.out.println("Первые 10 чисел гармонического ряда:");

        for (int i = 1; i <= 10; i++) {
            double harmonicNumber = 1.0 / i;
            System.out.println(harmonicNumber);
        }
    }
}



