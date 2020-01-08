public class TopManager extends Company implements Employee {

    private static final double SALARY = 120000.0;
    private static final double BONUS = 1.5;

    @Override
    public double getMonthSalary() {
        if (getCompanyIncome() > 1000000)
            return  SALARY + SALARY * BONUS;
        else
            return SALARY;
    }

}
