public class Manager implements Employee {

    private static final double PROCENTS = 0.05;
    private double sales = 0;
    private double salary = 60000.0;

    public void salesByManager (Company company){
        double price = 60000.0 + Math.random()*100000.0;
        sales += price;
    }

    @Override
    public void calculateSalary() {
        salary = getSales() * PROCENTS + salary;
    }

    public double getSalary() {
        return salary;
    }

    public double getSales() {
        return sales;
    }

    @Override
    public double getMonthSalary() {
        return 0;
    }


}
