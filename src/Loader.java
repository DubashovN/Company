public class Loader {
    public static void main(String[] args) {

        Manager manager = new Manager();
        TopManager topManager = new TopManager();


        manager.setSales();
        System.out.println("Зарплата менеджера: " + manager.getMonthSalary());

        Company company = new Company();
        for (int i = 0; i <= 80; i++)
            company.hire(manager);
        company.setCompanyIncome();
        System.out.println(company.getCompanyIncome());

        for (int i = 0; i <=30; i++)
            company.hire(topManager);

        System.out.println(topManager.getMonthSalary());
//        company.getLowestSalaryStaff(5);

    }
}
