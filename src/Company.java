import java.util.ArrayList;

public class Company {

    int managerCount = 0;
    int topManagerCount = 0;
    private int companyIncome = 0;
    private ArrayList<Employee>employees = new ArrayList<>();

     public void hire(Employee employee){
         if ()
          employees.add(employee);

     }
//     public void hireAll(){
//            employees.add(hireManager());
//     }
     public void hireManager(Manager manager){
         employees.add(manager);
         count++;
         System.out.println("Родился менеджер! " + count);
     }
     public void hireTopManager(TopManager topManager){
         employees.add(topManager);
         count++;
         System.out.println("Родился топменеджер! " + count);

     }

     public void fire(Employee employee){
        employees.remove(employee);
         count--;
     }

//     public double getIncome(){
//
//        for (Employee employee : employees)if (employee instanceof Manager) {
//            income += ((Manager) employee).getSales();
//        }
//         return income;
//     }

    public ArrayList<Employee> getTopSalary(int count){
        return null;
    }

    public ArrayList<Employee> getLowestSalary(int count){
        return null;
    }

    public double getCompanyIncome() {
        for (Employee employee : employees)if (employee instanceof Manager) {
            companyIncome += ((Manager) employee).getSales();
        }
        return companyIncome;
    }

    public void setCompanyIncome(int companyIncome) {
        this.companyIncome = companyIncome;
    }

}
