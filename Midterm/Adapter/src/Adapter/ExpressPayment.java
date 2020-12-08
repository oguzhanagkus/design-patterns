package Adapter;

/**
 * This is an old payment method which implements TurboPayment method.
 * It is created to test adapter class.
 */
public class ExpressPayment implements TurboPayment {
    /**
     * Pay method.
     * @param turboCardNo card no
     * @param turboAmount amount
     * @param destinationTurboOfCourse payment target
     * @param installmentsButInTurbo installment
     * @return status
     */
    @Override
    public int payInTurbo(String turboCardNo, float turboAmount, String destinationTurboOfCourse, String installmentsButInTurbo) {
        System.out.println("Paid with Turbo!");
        return 0;
    }
}
