package HW64;

public class Operator implements Employee {
    private final String name;
    private double salary;

    public Operator(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public double getMonthSalary(Company company) {
        return salary;
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
}
