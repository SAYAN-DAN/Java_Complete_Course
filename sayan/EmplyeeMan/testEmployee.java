package sayan.EmplyeeMan;

public class testEmployee {
    public static void main(String[] args) {
        Employee emp = new Employee("Sayan", 20, 10000);
        System.out.println(emp.getEmployeeDetails());
        emp.setname("Mota");
        System.out.print(emp.getEmployeeDetails());

    }
}
