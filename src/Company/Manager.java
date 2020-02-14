package Company;

public class Manager implements Employee {
    private double salary;
    private double sales;
    private static final double BONUS = 0.05;
    private static final int START_SALARY = 60000;

    public Manager() {
        this.salary = randomSalary();
        this.sales = randomSales();
    }

    double getMadeMoney() {
        return sales;
    }

    public double getMonthSalary() {
        return salary + sales * BONUS;
    }

    private int randomSalary(){
        return (int) (START_SALARY + (Math.random() * 10000));
    }
    private int randomSales(){
        return (int) (Math.random() * 1000000);
    }
}