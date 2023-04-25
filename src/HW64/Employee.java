package HW64;

public interface Employee extends Comparable<Employee> {

    double getMonthSalary(Company company);

    String getName();

    double getSalary();

    int compareTo(Employee employee);
}
