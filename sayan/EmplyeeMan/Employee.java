package sayan.EmplyeeMan;

public class Employee {
    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    String getEmployeeDetails() {
        return "EmployeeDetails: Name: " + name
                + ", Age:" + age
                + " , Salary:" + salary + " ";
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public int getage() {
        return age;
    }

    public void setage(int age) {
        this.age = age;
    }

    public double getsalary() {
        return salary;
    }

    public void setsalary(double salary) {
        this.salary = salary;
    }
}
