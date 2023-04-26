package HW64;

public class Main {
    public static void main(String[] args) {

//      Тестовые сотрудники.
        Operator operator1 = new Operator("Operator1", 1000);
        Operator operator2 = new Operator("Operator1", 4000);
        Operator operator3 = new Operator("Operator1", 3000);
        Operator operator4 = new Operator("Operator1", 2000);
        Operator operator5 = new Operator("Operator2", 2000);
        Operator operator6 = new Operator("Operator2", 1000);
        Operator operator7 = new Operator("Operator2", 4000);

        Manager manager1 = new Manager("Valera", 50000);
        TopManager topManager1 = new TopManager("Michail", 200000);

//      Создание компании и найм в нее тестовых сотрудников.
        Company company1 = new Company("Компания 1", 11000000);
        company1.hire(operator1);
        company1.hire(operator2);
        company1.hire(operator3);
        company1.hire(operator4);
        company1.hire(operator5);
        company1.hire(operator6);
        company1.hire(operator7);
//        company1.hire(manager1);
//        company1.hire(topManager1);

//      Создание листа с рандомными сотрудниками для массового добавления в компанию методом в классе компании.
//        ListToAdd.addEmployeesToArrayList();

//      Найм в компанию 180 Операторов, 80 менеджеров и 10 Топменеджеров с рассчетом зарплат согласно заданию.
//        company1.hireAll(ListToAdd.listToHireAll);

//        TODO
//         !!! Не печатает из метода!!!
//        company1.employeesSize();

//      Удаление случайно половины сотрудников.
//        int companyEmployeesCount = company1.getEmployeesSize();
//        for (int i = 0; i < companyEmployeesCount / 2; i++) {
//            int randomChooser = (int) (1 + (Math.random() * company1.getEmployeesSize()));
//            Employee toDelete = company1.getEmployerByIndex(i);
//            company1.retire(toDelete);
//        }

//        Вывод количества оставшихся сотрудников и 10 максимальных и минимальных зарплат.
//        company1.printEmployeesSize();
//        System.out.println("====");
//        company1.getLowestSalaryStaff(10);
//        System.out.println("====");
//        company1.getTopSalaryStaff(10);
        company1.sortColl();
        company1.printAllEmployeesWithSalaries();
    }
}