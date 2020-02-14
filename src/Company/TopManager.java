package Company;

public class TopManager implements Employee {
    private double salary;
    private static final double BONUS = 1.5;
    private static final int PLAN = 10_000_000;
    private static final int START_SALARY = 120000;
    private Company company;

    public TopManager() {
        this.salary = randomSalary();
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public double getMonthSalary() {
        if (company.getIncome() > PLAN)
            return salary * BONUS + salary;
        else {
            return salary;
        }
    }

    private int randomSalary(){
        return (int) (START_SALARY + (Math.random() * 100000));
    }

}
