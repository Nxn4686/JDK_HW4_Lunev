package JDK_HW_4;

import java.util.List;

/**
 * Создать справочник сотрудников
 * Необходимо:
 * Создать класс справочник сотрудников, который содержит внутри
 * коллекцию сотрудников - каждый сотрудник должен иметь следующие атрибуты:
 * Табельный номер
 * Номер телефона
 * Имя
 * Стаж
 * Добавить метод, который ищет сотрудника по стажу (может быть список)
 * Добавить метод, который возвращает номер телефона сотрудника по имени (может быть список)
 * Добавить метод, который ищет сотрудника по табельному номеру
 * Добавить метод добавления нового сотрудника в справочник
 */

public class Main {
    public static void main(String[] args) {

        EmployeeDirectory directory = new EmployeeDirectory();

        directory.addEmployee(new Employee(101, "Иванов Иван", "123456789", 5));
        directory.addEmployee(new Employee(102, "Петров Петр", "987654321", 3));
        directory.addEmployee(new Employee(103, "Сидоров Сидор", "555555555", 5));
        directory.addEmployee(new Employee(104, "Михайлов Михаил", "111222333", 1));

        System.out.println("Сотрудники с 5-летним стажем:");
        List<Employee> employeesWith5YearsExperience = directory.findEmployeesByExperience(5);
        for (Employee e : employeesWith5YearsExperience) {
            System.out.println(e);
        }

        System.out.println("\nНомера телефонов сотрудников с именем 'Иванов Иван':");
        List<String> phoneNumbers = directory.findPhoneNumbersByName("Иванов Иван");
        for (String phone : phoneNumbers) {
            System.out.println(phone);
        }

        System.out.println("\nСотрудник с табельным номером 102:");
        Employee employee = directory.findEmployeeById(102);
        if (employee != null) {
            System.out.println(employee);
        } else {
            System.out.println("Сотрудник не найден.");
        }

        System.out.println("\nВсе сотрудники:");
        directory.printAllEmployees();

    }
}