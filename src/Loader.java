import Company.*;
import java.util.ArrayList;
import java.util.List;

public class Loader {

    public static void main(String[] args) {
        int countOperators = 180;
        int countManagers = 80;
        int countTopManagers = 10;
        Company company = new Company();
        List<Employee> operators = new ArrayList<>();
        List<Employee> managers = new ArrayList<>();

        for(int i = 0; i < 180; i++) {
            operators.add(new Operator());
        }

        company.hireAll(operators);

        for(int i = 0; i < 80; i++) {
            Manager manager = new Manager();
            managers.add(manager);
        }

        company.hireAll(managers);

        for(int i = 0; i < 10; i++) {
            TopManager topManager = new TopManager();
            topManager.setCompany(company);
            company.hire(topManager);
        }

        System.out.println("Top salary");
        for (Employee employee : company.getTopSalary(5)){
            System.out.println(employee.getMonthSalary());
        }

        System.out.println("Lowest salary");
        for (Employee employee : company.getLowestSalary(15)){
            System.out.println(employee.getMonthSalary());
        }

        company.fire((countOperators + countManagers + countTopManagers) / 2);

        System.out.println("Top salary after fire");

        for (Employee employee : company.getTopSalary(5)){
            System.out.println(employee.getMonthSalary());
        }

        System.out.println("Lowest salary after fire");

        for (Employee employee : company.getLowestSalary(15)){
            System.out.println(employee.getMonthSalary());
        }
    }
}
