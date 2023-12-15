package ru.mirea.lab9;
import java.util.ArrayList;
import java.util.List;
public class TestSortingPeopleByGPA {
    public static void main(String[] args) {
        // Создаем список людей.
        List<Human> people = new ArrayList<>();
        people.add(new Human("Matvey", 5.0));
        people.add(new Human("Tolya", 3.2));
        people.add(new Human("Anatoliy", 4.3));

        // Сортировка списка людей по убыванию GPA с использованием SortingPeopleByGPA.
        people.sort(new SortingPeopleByGPA());

        // Вывод отсортированного списка людей.
        for (Human person : people) {
            System.out.println("Name: " + person.getName() + ", GPA: " + person.getGPA());
        }
    }
}
