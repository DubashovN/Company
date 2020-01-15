public class Manager implements Employee {

    private static final double SALARY = 60000.0;
    private static final double BONUS = 0.05;
    private double sales = 0;

    public Manager(){
        setSales();
    }
    @Override
    public double getMonthSalary() {

        return getSales() * BONUS + SALARY ;
    }

    public double getSales() {
        return sales;
    }

    public void setSales() {
        int randomSales = (int) (Math.random() * 1000000);
        sales+=randomSales;
        System.out.println("Продажи менеджера: " + sales);

    }

}
