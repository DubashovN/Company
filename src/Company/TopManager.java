package Company;

public class TopManager implements Employee {

    private static final double BONUS = 1.5;
    private static final int SALES_PLAN = 10000000;
    private static final int START_SALARY = 120000;
    private int salary = 0;
    int topManagerCount = 0;

    private Company company;

    public TopManager(){
        setSalary();
        topManagerCount++;
    }


    public void setSalary() {
        int randomSalary = (int) (START_SALARY + (Math.random() * 100000));
        salary+=randomSalary;
    }
    public int getSalary() {
        return salary;
    }

    @Override
    public double getMonthSalary() {
//        if (getCompanyIncome() >= SALES_PLAN)
//            return getSalary() * BONUS + getSalary();
//        else {
            return getSalary();
//        }

    }

}
