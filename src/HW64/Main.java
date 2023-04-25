package HW64;

public class Main {
    public static void main(String[] args) {

        Operator operator1 = new Operator("Vasiliy",1000);
        Manager manager1 = new Manager("Valera", 50000);
        operator1.getName();
        operator1.setSalary(1001);
        operator1.getSalary();

        Company company1 = new Company("Компания 1",1000009);
        company1.hire(operator1);
        company1.hire(manager1);
        company1.getIncome();
        company1.getEmp();





    }
}