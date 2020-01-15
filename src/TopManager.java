public class TopManager extends Company implements Employee {

    private static final double BONUS = 1.5;
    private static final int SALES_PLAN = 10000000;
    private static final int START_SALARY = 120000;
    private int salary = 0;

    public TopManager(){

        setSalary();
        System.out.println(("ЗП топа" ) + getMonthSalary());
    }

    public void setSalary() {
        double randomSalary = START_SALARY + (Math.random() * 100000);
        salary+=randomSalary;
    }
    public int getSalary() {
        return salary;
    }

    @Override
    public double getMonthSalary() {
        if (getCompanyIncome() >= SALES_PLAN)
            return getSalary() * BONUS + getSalary();
        else {
            return getSalary();
        }

    }

}
