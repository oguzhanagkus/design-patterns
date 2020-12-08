package Transaction;

/**
 * This is my driver class.
 * It shows that a transaction is done and another transaction is failed.
 * When it failed, it rolls back from where it fails.
 */
public class Demo {
    /**
     * Main method.
     * @param args default arguments ignored
     */
    public static void main(String[] args) {
        Database simpleDatabase = new Database();
        simpleDatabase.addCustomer("01");
        simpleDatabase.addCustomer("02", 50);

        simpleDatabase.show();
        System.out.println("----------------------------------------");
        MoneyTransfer transfer1 = new MoneyTransfer(simpleDatabase,"02", "01", 10);
        transfer1.execute();
        System.out.println("--> Money transfer done.");
        System.out.println("----------------------------------------");
        simpleDatabase.show();
        System.out.println("----------------------------------------");
        MoneyTransfer transfer2 = new MoneyTransfer(simpleDatabase,"02", "03", 10);
        transfer2.execute();
        System.out.println("--> Money transfer failed.");
        System.out.println("----------------------------------------");
        simpleDatabase.show();
    }
}
