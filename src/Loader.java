import Company.Company;
import Company.Manager;
import Company.Operator;
import Company.TopManager;

public class Loader {
    public static void main(String[] args) {

        Company company = Company.createCompany();

        for (int i = 0; i <= 80; i++)
            company.hire(new Manager());
        for (int i = 0; i <=10; i++)
            company.hire(new TopManager());
        for (int i = 0; i < 180; i++)
            company.hire(new Operator());

        company.getTopSalary(15).forEach(employee -> System.out.println(employee.getMonthSalary()));
        company.getLowestSalary(30).forEach(employee -> System.out.println(employee.getMonthSalary()));

        for (int i = 0; i <= 40; i++)
            company.fire(new Manager());
        for (int i = 0; i <= 5; i++)
            company.fire(new TopManager());
        for (int i = 0; i <= 90; i++)
            company.fire(new Operator());

        company.getTopSalary(15).forEach(employee -> System.out.println(employee.getMonthSalary()));
        company.getLowestSalary(30).forEach(employee -> System.out.println(employee.getMonthSalary()));

    }
}
