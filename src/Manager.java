public class Manager implements Employee {

    private static final double SALARY = 60000.0;
    private static final double BONUS = 0.05;
    private double sales;

    public void salesByManager(){
        int randomSales = (int) (Math.random() * 100000);
        sales+=randomSales;
        System.out.println("Продажи менеджера: " + sales);
    }

    @Override
    public double getMonthSalary() {
        return this.sales * BONUS + SALARY ;

    }

    public double getSales() {
        return sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }

}
