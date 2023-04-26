package HW64;

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

        company1.hireAll(ListToAdd.listToHireAll);

//        company1.printAllEmployeesWithSalaries();
        System.out.println("====");
        company1.getLowestSalaryStaff(10);
        System.out.println("====");
        company1.getTopSalaryStaff(10);

//        !!! Не печатает из метода!!!
//        company1.employeesSize();

        company1.printEmployeesSize();

        int companyEmployeesCount = company1.getEmployeesSize();
        for (int i = 0; i < companyEmployeesCount / 2; i++) {
            int randomChooser = (int) (1 + (Math.random() * company1.getEmployeesSize()));
            Employee toDelete = company1.getEmployerByIndex(i);
            company1.retire(toDelete);
        }
        company1.printEmployeesSize();
        System.out.println("====");
        company1.getLowestSalaryStaff(10);
        System.out.println("====");
        company1.getTopSalaryStaff(10);
    }
}