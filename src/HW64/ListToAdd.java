package HW64;

import java.util.ArrayList;
import java.util.List;

public class ListToAdd {

    protected static List<Employee> listToHireAll = new ArrayList<>();

    protected static void addEmployeesToArrayList() {
        for (int i = 0; i < 180; i++) {
            double operSalary = 10000 + (Math.random() * 20000);
            listToHireAll.add(new Operator("Operator " + (i + 1), operSalary));
        }

        for (int i = 0; i < 80; i++) {
            double managrSalary = 40000 + (Math.random() * 100000);
            listToHireAll.add(new Manager("Manager " + (i + 1), managrSalary));
        }

        for (int i = 0; i < 10; i++) {
            double managrSalary = 100000 + (Math.random() * 300000);
            listToHireAll.add(new TopManager("TopManager " + (i + 1), managrSalary));
        }
    }

    protected static void printAllEmployeesWithSalaries() {
        for (Employee employee : listToHireAll) {
            System.out.printf(employee.getClass().getSimpleName() +
                              " " + employee.getName() + ", зарплата: " +
                              "%.2f%n", employee.getSalary());
        }
    }

}
