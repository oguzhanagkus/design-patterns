package Adapter;

/**
 * This interface is an old interface but it is still used.
 */
public interface TurboPayment {
    /**
     * Pay method.
     * @param turboCardNo card no
     * @param turboAmount amount
     * @param destinationTurboOfCourse payment target
     * @param installmentsButInTurbo installment
     * @return status
     */
    int payInTurbo(String turboCardNo, float turboAmount,
                   String destinationTurboOfCourse, String installmentsButInTurbo);
}
