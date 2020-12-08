package Transaction;

/**
 * This class represents a money transfer.
 * It selects sender from database and decrease given amount.
 * Then selects receiver from database and increase given amount.
 *
 * It consist of 4 operation. They are executed in order.
 * If one of them fails, then it stops the executions last operations and start to rollback executed operations.
 */
public class MoneyTransfer extends Transaction {
    private int last;

    /**
     * Default constructor.
     * @param database database
     * @param senderID sender id
     * @param receiverID receiver id
     * @param amount amount
     */
    public MoneyTransfer(Database database, String senderID, String receiverID, int amount) {
        this.last = -1;

        Operation selectSender = new SelectOperation(database, senderID);
        Operation decreaseFromSender = new UpdateOperation(database, senderID, amount * -1);
        Operation selectReceiver = new SelectOperation(database, receiverID);
        Operation increaseToReceiver = new UpdateOperation(database, receiverID, amount);

        operations = new Operation[]{selectSender, decreaseFromSender, selectReceiver, increaseToReceiver};
    }

    /**
     * Execute all operations in order.
     * If one is fails, then rollback.
     */
    @Override
    public void execute() {
        for (int i = 0; i < operations.length; i++) {
            operations[i].execute();

            if (!operations[i].getStatus()) {
                rollback();
                break;
            }
            last = i;
        }

        status = true;
    }

    /**
     * Rollback from last executed operation.
     */
    @Override
    public void rollback() {
        if (last > -1) {
            for (int i = last; i >= 0; i--) {
                operations[i].rollback();
                last -= 1;
            }
        }
    }
}
