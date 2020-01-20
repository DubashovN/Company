package Company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class Company {

    int count = 0;
    private ArrayList<Employee>employees = new ArrayList<>();

    public static Company createCompany() {

        return new Company();
    }
     public void hire(Employee employee){
          employees.add(employee);
     }

     public void fire(Employee employee){
        employees.remove(employee);
     }

    public ArrayList<Employee> getTopSalary(int count){
        Collections.sort(employees, new TopSalaryComparator());
        return (ArrayList<Employee>) employees.stream().limit(count).collect(Collectors.toList());
    }

    public ArrayList<Employee> getLowestSalary(int count){
        Collections.sort(employees, new MinSalaryComparator());
        return (ArrayList<Employee>) employees.stream().limit(count).collect(Collectors.toList());
    }

    public int getCompanyIncome() {
        int companyIncome = 0;
        for (Employee employee : employees)
            if (employee instanceof Manager) {
                companyIncome += ((Manager) employee).getSales();
            }
        return companyIncome;
    }

    public void hireManager(Manager manager){
        employees.add(manager);
    }
    public void hireTopManager(TopManager topManager) {
        employees.add(topManager);
    }

    public void hireOperator (Operator operator){
        employees.add(operator);
    }

}
