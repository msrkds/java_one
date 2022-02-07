package ru.geekbrains.lesson_5;

public class Employee {

    private String fullName;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employee(String fullName, String position, String email, String phone, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void info() {
        System.out.println("Ф.И.О.: " + fullName + "; Должность: " + position + "; Email: " + email + "; Телефон: " + phone + "; Зарплата: " + salary + "; Возраст: " + age);
    }
}
