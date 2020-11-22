package LinearEquationSolver;

/**
 * This class implements LinearEquationSolver.SolvingMethod interface.
 * It uses methods that are in LinearEquationSolver.MatrixOperations class.
 */
public class MatrixInversion implements SolvingMethod {

    /**
     * Empty constructor. Only we need solve method.
     */
    public MatrixInversion() {
    }

    /**
     * Uses matrix inversion method for solving linear system equations.
     * @param equationSystem represents which equation system will be solved
     */
    @Override
    public void solve(LinearEquationSystem equationSystem) {
        double[][] inverseMatrix;
        double[][] constants;
        double[][] result;

        try {
            inverseMatrix = MatrixOperations.getInverse(equationSystem.getCoefficients());
        } catch (Exception e) {
            // System.out.println(e.getMessage());
            System.out.println("There is no solution for this equation system!");
            return;
        }

        constants = equationSystem.getConstants();
        result = MatrixOperations.multiply(inverseMatrix, constants);

        System.out.println("Solving with Matrix Inversion Method.");
        System.out.println("Results:");
        for (int i = 0; i < result.length; i++) {
            System.out.printf("  Root #" + (i+1) + " = %.5f%n", result[i][0]);
        }
    }
}