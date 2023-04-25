package HW64;

public class TopManager implements Employee {
    private final String name;
    private double salary;
    int annualMinIncome = 10000000;

    public TopManager(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public double getMonthSalary(Company company) {
        if (annualMinIncome < company.getIncome()) {
            double bonusSalary = (salary * 150.0) / 100.0;
            return salary += bonusSalary;
        } else {
            return salary;
        }
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee employee) {
        return Double.compare(getSalary(), employee.getSalary());
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
