package Company;

public class Operator implements Employee {
    private static final int START_SALARY = 30000;
    private int salary;

    public Operator() {
        this.salary = randomSalary();
    }

    public double getMonthSalary() {
        return salary;
    }
    private int randomSalary(){
        return (int) (START_SALARY + (Math.random() * 5000));
    }
}
