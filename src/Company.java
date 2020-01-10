import java.util.ArrayList;

public class Company {

    int countManager = 0;
    int countTopManager = 0;
    private int companyIncome = 0;
    private ArrayList<Employee>employees = new ArrayList<>();

     public void hire(Employee employee){
          employees.add(employee);
          if (employee instanceof Manager){
              countManager++;
//         System.out.println("Родился менеджер! " + countManager);
          }
           if (employee instanceof TopManager){
              countTopManager++;
//         System.out.println("Родился топменеджер! " + countTopManager);
           }
     }
//     public void hireAll(){
//            employees.add(hireManager());
//     }

     public void hireManager(Manager manager){
         employees.add(manager);
         countManager++;
         System.out.println("Родился менеджер! " + countManager);
     }
     public void hireTopManager(TopManager topManager){
         employees.add(topManager);
         countTopManager++;
         System.out.println("Родился топменеджер! " + countTopManager);
     }

     public void fire(Employee employee){
        employees.remove(employee);
         if (employee instanceof Manager)
             countManager--;
         if (employee instanceof TopManager)
             countTopManager--;
     }

    public ArrayList<Employee> getTopSalary(int count){
        return null;
    }

    public ArrayList<Employee> getLowestSalary(int count){
        return null;
    }

    int getCompanyIncome() {
        return this.companyIncome;
    }
    void setCompanyIncome() {
        for (Employee employee : employees)
            if (employee instanceof Manager) {
                this.companyIncome += ((Manager) employee).getSales();

            }
        System.out.println("Компания заработала: " + this.companyIncome);
    }
}
