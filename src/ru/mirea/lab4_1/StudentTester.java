package ru.mirea.lab4_1;

public class StudentTester {
    public static void main(String[] args) {
        // Создаем массив объектов суперкласса Student и заполняем его
        Student[] students = new Student[5];
        students[0] = new SchoolStudent("Ivan", 15, 9);
        students[1] = new SchoolStudent("Maria", 14, 8);
        students[2] = new UniversityStudent("Peter", 20, "University A");
        students[3] = new UniversityStudent("Anna", 19, "University B");
        students[4] = new SchoolStudent("Sergei", 16, 10);

        // Показываем студентов и школьников
        System.out.println("Students:");
        for (Student student : students) {
            if (student instanceof UniversityStudent universityStudent) {
                System.out.println("Name: " + universityStudent.getName() + ", Age: " + universityStudent.getAge() + ", University: " + universityStudent.getUniversity());
            }
        }

        System.out.println("\nSchool Students:");
        for (Student student : students) {
            if (student instanceof SchoolStudent) {
                SchoolStudent schoolStudent = (SchoolStudent) student;
                System.out.println("Name: " + schoolStudent.getName() + ", Age: " + schoolStudent.getAge() + ", Grade: " + schoolStudent.getGrade());
            }
        }
    }
}
