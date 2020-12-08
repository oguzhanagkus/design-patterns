package Transaction;

/**
 * This class represents UPDATE operation. It change a customer's balance if it is possible.
 */
public class UpdateOperation extends Operation {
    private Database database;
    private String id;
    private int amount;

    /**
     * Default constructor.
     * @param database database
     * @param id customer id
     * @param amount change amount
     */
    public UpdateOperation(Database database, String id, int amount) {
        this.database = database;
        this.id = id;
        this.amount = amount;
    }

    /**
     * Update balance if it is possible.
     * If it is succeed then change the status as true.
     */
    @Override
    public void execute() {
        int balance = database.getBalance(id);

        if (balance == -1) {
            return;
        }

        if (balance < (-1 * amount)) {
            return;
        }

        database.setBalance(id, balance + amount);
        status = true;
    }

    /**
     * Rollback the update if and only if it was succeed.
     * After updating, change the status as false to block multiple rollback.
     */
    @Override
    public void rollback() {
        if (status) {
            int balance = database.getBalance(id);
            database.setBalance(id, balance + (-1 * amount));
            status = false;
        }
    }
}
