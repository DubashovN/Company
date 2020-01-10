public class TopManager extends Company implements Employee {

    private static final int SALARY = 120000;
    private static final double BONUS = 1.5;
    private static final int SALES_PLAN = 10000000;

    @Override
    public double getMonthSalary() {
        if (getCompanyIncome() > SALES_PLAN)
            return SALARY * BONUS + SALARY ;
        else
            return SALARY;
    }

}
