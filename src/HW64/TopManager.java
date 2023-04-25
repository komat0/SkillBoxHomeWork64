package HW64;

public class TopManager implements Employee {
    private String name;
    private double salary;

    public TopManager(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        System.out.println(name);
        return name;
    }

    public double getSalary() {
        System.out.println("Зарплата " + name + " составляет " + salary);
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}