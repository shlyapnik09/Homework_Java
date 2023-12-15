package ru.mirea.lab10;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
    private String firstName;
    private String lastName;
    private String major;
    private int year;
    private String group;
    private Date dateOfBirth; // новое поле для даты рождения

    public Student(String firstName, String lastName, String major, int year, String group, Date dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.major = major;
        this.year = year;
        this.group = group;
        this.dateOfBirth = dateOfBirth;
    }
// новый геттер для даты
    public Date getDateOfBirth() {
        return dateOfBirth;
    }
// новый сеттер для даты
    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    // Геттеры и сеттеры для каждой переменной экземпляра
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }
    public String formatDateOfBirth(String format) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        return dateFormat.format(dateOfBirth);
    }
    public String toString() {
        return "Студент{" +
                "  Фамилия ='" + lastName + '\'' +
                ", Имя ='" + firstName + '\'' +
                ", Направление ='" + major + '\'' +
                ", Курс  =" + year +
                ", Группа ='" + group + '\'' +
                ", ДР ='" + dateOfBirth + '\'' +
                '}';
    }
    public static void main(String[] args) {
        // Создание объекта класса Student и Date
        Date dateOfBirth = new Date(2004,10, 16 );
        Student student = new Student("Белянков", "Анатолий", "Информатика и вычислительная техника", 2, "ИВБО-01-22", dateOfBirth);
        // Использование методов доступа
        System.out.println(student);
        System.out.println("Дата рождения в среднем формате: " + student.formatDateOfBirth("16 10 2004"));
    }
}
