package Adapter;

/**
 * This is an adapter class which can make easy to use old TurboPayment method with new Modern Payment method.
 */
public class TurboPaymentAdapter implements ModernPayment {
    TurboPayment turboPayment;

    /**
     * Default constructor.
     * @param turboPayment turboPayment object
     */
    public TurboPaymentAdapter(TurboPayment turboPayment) {
        this.turboPayment = turboPayment;
    }

    /**
     * A wrapper for TurboPayments pay method.
     * @param cardNo card no
     * @param amount amount
     * @param destination payment target
     * @param installments installment
     * @return status
     */
    @Override
    public int pay(String cardNo, float amount, String destination, String installments) {
        System.out.println("Adapter will be used!");
        return turboPayment.payInTurbo(cardNo, amount, destination, installments);
    }
}
