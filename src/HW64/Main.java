package HW64;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Operator operator1 = new Operator("Vasiliy", 1000);
        Manager manager1 = new Manager("Valera", 50000);
        TopManager topManager1 = new TopManager("Michail", 200000);

        Company company1 = new Company("Компания 1", 11000000);
//        company1.hire(operator1);
//        company1.hire(manager1);
//        company1.hire(topManager1);

        ListToAdd.addEmployeesToArrayList();
//        ListToAdd.printAllEmployeesWithSalaries();

        company1.hireAll(ListToAdd.listToHireAll);

        company1.printAllEmployeesWithSalaries();
        company1.employeesSize();
//        System.out.printf("%.2f%n", company1.getIncome());
//        System.out.printf("%.2f%n", operator1.getMonthSalary(company1));
//        System.out.printf("%.2f%n", manager1.getMonthSalary(company1));
//        System.out.printf("%.2f%n", topManager1.getMonthSalary(company1));
    }
}