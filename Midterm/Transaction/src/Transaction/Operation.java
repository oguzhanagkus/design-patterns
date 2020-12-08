package Transaction;

/**
 * This abstract class represents an operation. It can be select, update, etc.
 * Operations can be executed and rolled back.
 * Also there it has a method to check if operation is succeed.
 */
public abstract class Operation {
    protected boolean status = false;

    /**
     * Does its job
     */
    abstract void execute();

    /**
     * Undoes what it did
     */
    abstract void rollback();

    /**
     * Operation is succeed or not.
     * @return status
     */
    boolean getStatus() {
        return status;
    }
}
