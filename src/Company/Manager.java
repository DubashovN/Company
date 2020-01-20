package Company;

public class Manager implements Employee {

    private static final double BONUS = 0.05;
    private static final int START_SALARY = 60000;
    private double sales = 0;
    private int salary = 0;
    int managerCount = 0;

    public Manager(){
        setSales();
        setSalary();
        managerCount++;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary() {
        int randomSalary = (int) (START_SALARY + (Math.random() * 10000));
        salary += randomSalary;
    }
    @Override
    public double getMonthSalary() {

        return getSales() * BONUS + getSalary() ;
    }

    public double getSales() {
        return sales;
    }

    public void setSales() {
        int randomSales = (int) (Math.random() * 1000000);
        sales+=randomSales;
    }

}
