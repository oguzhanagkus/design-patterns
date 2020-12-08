package Transaction;

/**
 * This class represents SELECT operation. Actually it only checks if the id exist in the database.
 */
public class SelectOperation extends Operation {
    private Database database;
    private String id;

    /**
     * Default constructor.
     * @param database which database
     * @param id customer id
     */
    public SelectOperation(Database database, String id) {
        this.database = database;
        this.id = id;
    }

    /**
     * Check if the id exist in database.
     * If it exists status will be true.
     * Otherwise status will not change, it is still false.
     */
    @Override
    public void execute() {
        int index = database.exits(id);

        if (index == -1) {
            return;
        }

        status = true;
    }

    /**
     * Actually no action for select operation.
     * Only if execute succeed, it change the status value as false.
     */
    @Override
    public void rollback() {
        if (status) {
            status = false;
        }
    }
}
