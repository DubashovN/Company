import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class Company {

    int countManager = 0;
    int countTopManager = 0;
    int countOperator = 0;
    private ArrayList<Employee>employees = new ArrayList<>();

    public static Company createCompany() {

        return new Company();
    }
     public void hire(Employee employee){
          employees.add(employee);
          if (employee instanceof Manager){
              countManager++;
          } if (employee instanceof TopManager){
              countTopManager++;
           } if (employee instanceof Operator){
               countOperator++;
         }
     }

     public void fire(Employee employee){
        employees.remove(employee);
         if (employee instanceof Manager)
             countManager--;
         if (employee instanceof TopManager)
             countTopManager--;
         if (employee instanceof Operator)
             countOperator--;
     }

    public ArrayList<Employee> getTopSalary(int count){
        Collections.sort(employees, new topSalaryComparator());
        return (ArrayList<Employee>) employees.stream().limit(count).collect(Collectors.toList());
    }

    public ArrayList<Employee> getLowestSalary(int count){
        return null;
    }

//    public void setCompanyIncome() {
//        for (Employee employee : employees)
//            if (employee instanceof Manager) {
//                companyIncome += ((Manager) employee).getSales();
//            }
//
//    }

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
        manager.setSales();
        countManager++;
    }
    public void hireTopManager(TopManager topManager){
        employees.add(topManager);
        countTopManager++;
    }

    public void hireOperator (Operator operator){
        employees.add(operator);
        countOperator++;
    }

}
