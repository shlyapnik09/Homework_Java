package ru.mirea.lab9;

import java.util.Comparator;
class SortingPeopleByGPA implements Comparator<Human> {
    @Override
    public int compare(Human person1, Human person2) {
        // Сравниваем людей по убыванию GPA (итоговых баллов).
        // Для убывания возвращаем отрицательное значение, для возрастания - положительное.
        // Если GPA равны, то считаем их равными.
        return Double.compare(person2.getGPA(), person1.getGPA());
    }
}