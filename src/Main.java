import java.util.Arrays;

public class Main {
    static Employee[] employees = new Employee[10];

    public static void main(String[] args) {

        employees[0] = new Employee("Баранова Наталья Леонидовна", 1, 50500);
        employees[1] = new Employee("Коваль Максим Александрович", 2, 35000);
        employees[2] = new Employee("Сердитов Дмитрий Сергеевич", 3, 65000);
        employees[3] = new Employee("Белослудцев Сергей Андреевич", 4, 90000);
        employees[4] = new Employee("Первухина Мария Геннадьевна", 5, 70000);
        employees[5] = new Employee("Чаплыгин Александр Геннадьевич", 1, 100000);
        employees[6] = new Employee("Попов Сергей Павлович", 2, 25000);
        employees[7] = new Employee("Зингер Светлана Михайловна", 3, 40000);
        employees[8] = new Employee("Пермяков Денис Андреевич", 4, 60000);
        employees[9] = new Employee("Долженкова Ирина Васильевна", 5, 55000);
        printInfoEmployee();
        printSumSalary();
        printMinSalary();
        printMaxSalary();
        printAverageSalary();
        printFullNameEmployees();

    }

    static void printInfoEmployee() {
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }

    static void printSumSalary() {
        double sumSalary = 0;
        for (Employee emp : employees) {
            sumSalary = sumSalary + emp.getSalary();
        }
        System.out.println("Сумма всех затрат на зарплату: " + sumSalary + " рублей");
    }

    static void printMinSalary() {
        double minSalary = employees[0].getSalary();
        Employee name = employees[0];
        for (Employee emp : employees) {
            if (emp.getSalary() < minSalary) {
                minSalary = emp.getSalary();
                name = emp;
            }
        }
        System.out.println("Минимальная зарплата сотрудника: " + name.toString() + " рублей");
    }

    static void printMaxSalary() {
        double maxSalary = 0;
        Employee name = employees[0];
        for (Employee emp : employees) {
            if (emp.getSalary() > maxSalary) {
                maxSalary = emp.getSalary();
                name = emp;
            }
        }
        System.out.println("Максимальная зарплата сотрудника: " + name.toString() + " рублей");
    }

    static void printAverageSalary() {
        double average = 0;
        double sumSalary = 0;
        for (Employee emp : employees) {
            sumSalary = sumSalary + emp.getSalary();
            average = sumSalary / emp.getId();
        }
        System.out.println("Средняя зарплата сотрудника: " + average + " рублей");
    }

    static void printFullNameEmployees() {
        for (Employee emp : employees) {
            System.out.println(emp.getFullName());
        }
    }
}
