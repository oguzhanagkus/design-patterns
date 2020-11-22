package LinearEquationSolver;

import java.util.Scanner;

/**
 * This class represents a linear equations system.
 * It stores coefficients and constants in two dimensional arrays.
 *
 * Example:
 *  2x+3y=5
 *  5x-2y=3
 *
 *  Coefficients:
 *  |2  3|
 *  |5 -2|
 *
 *  Constants:
 *  |5|
 *  |3|
 */
public class LinearEquationSystem {
    private int variableCount;
    private double[][] constants;
    private double[][] coefficients;
    private final Scanner input = new Scanner(System.in);

    /**
     * Constructor calls setter methods.
     */
    public LinearEquationSystem() {
        setVariableCount();
        setCoefficients();
    }

    /**
     * Sets variable count. Reads input until it is valid.
     */
    private void setVariableCount() {
        do {
            System.out.print("Enter variable count: ");
            variableCount = input.nextInt();
        } while (variableCount < 1);
    }

    /**
     * Reads and sets coefficients of equations, it waits at least n equations for n variables.
     *
     * Example: For 2x+3y=5 enter "2 3 5"
     *          For 4y=12 enter "4 12" if variable count is 1
     *          For 4y=12 enter "0 4 12" if variable count is 2
     */
    private void setCoefficients() {
        constants = new double[variableCount][1];
        coefficients = new double[variableCount][variableCount];

        System.out.println("Enter coefficients with space then press enter for each equation: ");

        for (int i = 0; i < variableCount; i++) {
            for (int j = 0; j < variableCount; j++) {
                coefficients[i][j] = input.nextDouble();
            }
            constants[i][0] = input.nextDouble();
        }
    }

    /**
     * Gets coefficients
     * @return coefficients
     */
    public double[][] getCoefficients() {
        return coefficients;
    }

    /**
     * Gets constants
     * @return constants
     */
    public double[][] getConstants() {
        return constants;
    }
}