package LinearEquationSolver;

/**
 * This class implements LinearEquationSolver.SolvingMethod interface.
 * Its solve method uses gaussian elimination method.
 */
public class GaussianElimination implements SolvingMethod {

    /**
     * Empty constructor.
     */
    public GaussianElimination() {
    }

    /**
     * Uses gaussian elimination method for solving linear equation system.
     * @param equationSystem represents which equation system will be solved
     */
    @Override
    public void solve(LinearEquationSystem equationSystem) {
        double[][] constants = equationSystem.getConstants().clone();
        double[][] coefficients = equationSystem.getCoefficients().clone();
        double[] result;
        double[] temp_row;
        double temp, factor, sum;
        int max;
        int size = constants.length;

        // Find pivot row
        for (int k = 0; k < size; k++) {
            max = k;
            for (int i = k + 1; i < size; i++) {
                if (Math.abs(coefficients[i][k]) > Math.abs(coefficients[max][k])) {
                    max = i;
                }
            }

            // Swap rows
            temp_row = coefficients[k];
            coefficients[k] = coefficients[max];
            coefficients[max] = temp_row;

            // Swap values
            temp = constants[k][0];
            constants[k][0] = constants[max][0];
            constants[max][0] = temp;

            // Pivot between coefficients and constants
            for (int i = k + 1; i < size; i++) {
                factor = coefficients[i][k] / coefficients[k][k];
                constants[i][0] -= factor * constants[k][0];
                for (int j = k; j < size; j++) {
                    coefficients[i][j] -= factor * coefficients[k][j];
                }
            }
        }

        // Backward substitution
        try {
            result = new double[size];
            for (int i = size - 1; i >= 0; i--) {
                sum = 0;
                for (int j = i + 1; j < size; j++) {
                    sum += coefficients[i][j] * result[j];
                }
                if (coefficients[i][i] == 0) {
                    throw new Exception();
                }
                result[i] = (constants[i][0] - sum) / coefficients[i][i];
            }
        } catch (Exception e) {
            System.out.println("There is no solution for this equation system!");
            return;
        }

        System.out.println("Solving with Gaussian Elimination Method.");
        System.out.println("Results:");
        for (int i = 0; i < result.length; i++) {
            System.out.printf("  Root #" + (i+1) + " = %.5f%n", result[i]);
        }
    }
}