import java.util.Scanner;

class Employee{
    String name;
    double salary;

    Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    void display(){
        System.out.println("Name: "+name);
        System.out.println("Salary: "+salary);
    }
}

class Manager extends Employee{
    String department;

    Manager (String name, double salary, String department){
        super(name, salary);
        this.department = department;
    }
    void display(){
        super.display();
        System.out.println("Department: " + department);
    }
}

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Salary: ");
        double salary = sc.nextDouble();
        sc.nextLine();

        System.out.println("Enter your name; ");
        String name = sc.nextLine();

        System.out.println("Department: ");
        String department = sc.nextLine();

        Manager m = new Manager(name, salary, department);
        System.out.println("Manager details");
        m.display();

        sc.close();
    }
}