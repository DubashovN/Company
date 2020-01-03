public class Loader {
    public static void main(String[] args) {


        Manager manager = new Manager();

        manager.salesByManager();
        System.out.println(manager.getSales());
    }
}
