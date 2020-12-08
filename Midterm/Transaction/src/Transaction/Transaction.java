package Transaction;

/**
 * This abstract class represents a transaction which is consist of multiple operations.
 */
public abstract class Transaction extends Operation {
    Operation[] operations;
}
