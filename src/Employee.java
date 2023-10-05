public class Employee {
    String fullName;
    Double salary;
    private int department;
    private static int employeeIdCounter = 0;
    private int id;

    public Employee(String fullName, int department, double salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        id = ++employeeIdCounter;
    }

    public String getFullName() {
        return this.fullName;
    }

    public Double getSalary() {
        return this.salary;
    }

    public int getDepartment() {
        return this.department;
    }

    public int getId() {
        return this.id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "ID: " + id + " Ф.И.О: " + fullName + " Отдел: " + department + " Зарплата: " + salary;
    }
}
