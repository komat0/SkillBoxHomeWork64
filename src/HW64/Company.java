package HW64;

import java.util.*;

public class Company {
    private final String companyName;
    private double income;
    private final List<Employee> employees = new ArrayList<>();

    public Company(String companyName, double income) {
        this.companyName = companyName;
        this.income = income;
    }

    public void hire(Employee employee) {
        System.out.println("Нанят сотрудник " + employee.getName());
        employees.add(employee);
    }

    public void hireAll(List<Employee> list) {
        employees.addAll(list);
        System.out.println(employees.size());
    }

    public void retire(Employee employee) {
        if (employees.contains(employee)) {
            employees.remove(employee);
            System.out.println("Сотрудник " + employee.getName() + " уволен");
        }
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double newIncome) {
        this.income = newIncome;
    }

    List<Employee> getTopSalaryStaff(int count) {
        employees.sort(Collections.reverseOrder());
        List<Employee> topSalaryStaff = employees.subList(0, count);
        for (Employee employee : topSalaryStaff) {
            System.out.printf(employee.getName() + ", зарплата: " +
                              "%.2f%n", employee.getSalary());
        }
        return topSalaryStaff;
    }

    List<Employee> getLowestSalaryStaff(int count) {
        employees.sort(Employee::compareTo);
        List<Employee> lowestSalaryStaff = employees.subList(0, count);
        for (Employee employee : lowestSalaryStaff) {
            System.out.printf(employee.getName() + ", зарплата: " +
                              "%.2f%n", employee.getSalary());
        }
        return lowestSalaryStaff;
    }

    public void printAllEmployeesWithSalaries() {
        System.out.println("Список сотрудников компании " + companyName + ":");
        for (Employee employee : employees) {
            System.out.printf(employee.getClass().getSimpleName() +
                              " " + employee.getName() + ", зарплата: " +
                              "%.2f%n", employee.getSalary());
        }
    }

    public List<Employee> getCompanyList() {
        return employees;
    }

    public int getEmployeesSize() {
        return employees.size();
    }

    public void printEmployeesSize() {
        System.out.println(employees.size());
    }

    public Employee getEmployerByIndex(int i) {
        return employees.get(i);
    }

    public void sortColl() {
        employees.sort(Comparator.comparing((Employee employee) -> employee.getSalary())
                .thenComparing(employee1 -> employee1.getName()));
    }
}

