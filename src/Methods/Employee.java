package Methods;

import java.util.Scanner;

public class Employee {

    static Scanner sc = new Scanner(System.in);

    double sal() {
        return sc.nextDouble();
    }

    double bonus() {
        return sc.nextDouble();
    }

    public static void main(String[] args) {

        Employee e1 = new Employee();

        System.out.println("Main method is started");

        System.out.print("Enter employee salary: ");
        double salary = e1.sal();

        System.out.print("Enter employee bonus: ");
        double bonus = e1.bonus();

        System.out.println("Salary = " + salary);
        System.out.println("Bonus = " + bonus);

        System.out.println("Main method is ended");
    }
}