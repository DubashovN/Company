public class Loader {
    public static void main(String[] args) {

//        Manager manager = new Manager();
//        TopManager topManager = new TopManager();
//        Operator operator = new Operator();
//        manager.setSales();


        Company company = Company.createCompany();

        for (int i = 0; i <= 80; i++)
            company.hire(new Manager());
//        company.setCompanyIncome();
        System.out.println(company.getCompanyIncome());

        for (int i = 0; i <=30; i++)
            company.hire(new TopManager());
        for (int i = 0; i < 150; i++)
            company.hire(new Operator());


//        company.getLowestSalary(5);
        company.getTopSalary(5).forEach(e -> System.out.println(e.getMonthSalary()));
    }
}
