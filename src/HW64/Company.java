package HW64;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private final String companyName;
    private double income;
    private List<Employee> emp = new ArrayList<>();

    public Company(String companyName, double income) {
        this.companyName = companyName;
        this.income = income;
    }

    public void hire(Employee employee) {
        System.out.println("Нанят сотрудник");
        emp.add(employee);
    }

    public void hireAll(List employeesList) {
        for (Object o : employeesList) {
            emp.add((Employee) o);
        }
    }

    public void fire(Employee employee) {
        if (emp.contains(employee)) {
            emp.remove(employee);
            System.out.println("Сотрудник уволен");
        }
    }

    public double getIncome() {
        System.out.println("Прибыль компании " + companyName + " составляет " + income);
        return income;
    }
    public void setIncome(double newIncome) {
        System.out.println("Прибыль компании " + companyName + "теперь составляет " + income);
        this.income = newIncome;
    }

//    static List<Employee> getTopSalaryStaff(int count){
//        return null;
//    }
//
//
//    static List<Employee> getLowestSalaryStaff(int count){
//        return null;
//    }

    public void getEmp() {
        for (Employee employee : emp) {
            System.out.println(employee);
        }
    }
}
