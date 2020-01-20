package Company;

public class Operator implements Employee {

    private static final double START_SALARY = 30000.0;
    private int salary = 0;
    int operatorCount = 0;

    public Operator(){
        setSalary();
        operatorCount++;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary() {
        int randomSalary = (int) (START_SALARY + (Math.random() * 5000));
        salary += randomSalary;
    }

    @Override
    public double getMonthSalary() {
        return getSalary();
    }
}
