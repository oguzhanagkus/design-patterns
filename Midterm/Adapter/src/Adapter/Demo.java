package Adapter;

/**
 * This is my driver class.
 * Shows that we can use a TurboPayment method as a Modern payment method thanks to adapter class.
 */
public class Demo {
    /**
     * Main method.
     * @param args default arguments ignored
     */
    public static void main(String[] args) {
        ExpressPayment expressPayment = new ExpressPayment();
        ModernPayment modernPayment = new TurboPaymentAdapter(expressPayment);

        modernPayment.pay("12345678", 1101, "87654321", "5");
    }
}
