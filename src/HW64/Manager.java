package HW64;

public class Manager implements Employee {

    private final String name;
    private double salary;
    private final double workedKPI = 115000 + (Math.random() * 140000);

    public Manager(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public double getMonthSalary(Company company) {
        double percentOfCompanyBenefit = (workedKPI * 5.0) / 100.0;
        salary = this.salary + percentOfCompanyBenefit;
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

    @Override
    public int compareTo(Employee employee) {
        return Double.compare(getSalary(), employee.getSalary());
    }

}
