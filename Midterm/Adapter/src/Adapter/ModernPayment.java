package Adapter;

/**
 * This is a new interface which is most secure and will be used in future.
 */
public interface ModernPayment {
    /**
     * Pay method.
     * @param cardNo card no
     * @param amount amount
     * @param destination payment target
     * @param installments installment
     * @return status
     */
    int pay(String cardNo, float amount, String destination, String installments);
}
