package Transaction;

import java.util.ArrayList;

/**
 * This is simple database class which is created for only testing design pattern.
 * It has only two fields customers and balances.
 */
public class Database {
    private ArrayList<String> customerIDs;
    private ArrayList<Integer> balances;

    /**
     * Default constructor.
     */
    public Database() {
        customerIDs = new ArrayList<>();
        balances = new ArrayList<>();
    }

    /**
     * Add new customer with 0 balance.
     * @param id customer id
     */
    public void addCustomer(String id) {
        customerIDs.add(id);
        balances.add(0);
    }

    /**
     * Add new customer with initial balance.
     * @param id customer id
     * @param balance initial balance
     */
    public void addCustomer(String id, int balance) {
        customerIDs.add(id);
        balances.add(balance);
    }

    /**
     * Checks if an id exists.
     * @param id customer id
     * @return index if exits, otherwise -1
     */
    public int exits(String id) {
        return customerIDs.indexOf(id);
    }

    /**
     * Get balance of a customer.
     * @param id customer id
     * @return balance
     */
    public int getBalance(String id) {
        int index = exits(id);

        if (index > -1) {
            return balances.get(index);
        }
        else {
            return -1;
        }
    }

    /**
     * Set new balance for a customer.
     * @param id customer id
     * @param balance new balance
     */
    public void setBalance(String id, int balance) {
        int index = exits(id);

        if (index > -1) {
            balances.set(index, balance);
        }
    }

    /**
     * Shows customers and their balances.
     */
    public void show() {
        System.out.println("ID\tBalance");
        System.out.println("-------------");

        for (int i = 0; i < customerIDs.size(); i++) {
            System.out.println(customerIDs.get(i) + "\t" + balances.get(i));
        }
    }
}
