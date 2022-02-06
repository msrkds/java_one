package ru.geekbrains.lesson_5;

public class HomeWorkApp {

    public static class Employee {
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
        public void info() {
            System.out.println("Ф.И.О.: " + fullName + "; Должность: " + position + "; Email: " + email + "; Телефон: " + phone + "; Зарплата: " + salary + "; Возраст: " + age);
        }
    }

    public static void main(String[] args) {

        Employee[] employeeArray = new Employee[5];
        employeeArray[0] = new Employee("Иванов Николай Петрович", "ведущий инженер ОИТ", "ivanov@gmail.com", "+77018142345", 180000, 22);
        employeeArray[1] = new Employee("Петров Иван Владимирович", "главный инженер ОИТ", "petrov@gmail.com", "+77018142342", 205000, 39);
        employeeArray[2] = new Employee("Пыжин Владимир Викторович", "начальник ОИТ", "pygin@gmail.com", "+77018142340", 250000, 50);
        employeeArray[3] = new Employee("Сидоров Игорь Сергеевич", "ведущий инженер ОИТ", "sidorov@gmail.com", "+77018142341", 180000, 25);
        employeeArray[4] = new Employee("Шиков Пётр Николаевич", "главный менеджер ОИТ", "shykov@gmail.com", "+77018142347", 220000, 43);

        for (int i=0; i < employeeArray.length; i++)
            if (employeeArray[i].age > 40) employeeArray[i].info();
    }
}
