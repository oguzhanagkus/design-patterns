package LinearEquationSolver;

import java.util.Scanner;

/**
 * This is my driver class. It has only main method.
 * It works as a terminal application.
 * It can get equation system and solving method.
 * Instructions can help to use.
 */
public class Demo {

    /**
     * Main method.
     * Solving methods are instantiated at beginning because it is test code.
     * It is not necessary to create new objects each time. Just change between two objects.
     * @param args default arguments, but not used
     */
    public static void main(String[] args) {
        int command;
        Scanner input = new Scanner(System.in);
        MatrixInversion matrixInversion = new MatrixInversion();
        GaussianElimination gaussianElimination = new GaussianElimination();
        LinearEquationSolver equationSolver = new LinearEquationSolver();

        System.out.println("Welcome to LinearSolverDeluxe!");
        System.out.println("Please enter an equation system:");
        equationSolver.setEquationSystem(new LinearEquationSystem());

        System.out.println("Enter 0 to exit");
        System.out.println("Enter 1 to solve with matrix inversion method");
        System.out.println("Enter 2 to solve with gaussian elimination method");
        System.out.println("Enter 3 to set new equation system");

        while (true) {
            System.out.print("Command: ");
            command = input.nextInt();
            switch (command) {
                case 0: System.exit(0);
                case 1: equationSolver.setSolvingMethod(matrixInversion);
                        equationSolver.run(); break;
                case 2: equationSolver.setSolvingMethod(gaussianElimination);
                        equationSolver.run(); break;
                case 3: equationSolver.setEquationSystem(new LinearEquationSystem()); break;
                default: System.out.println("Invalid command! Try again!"); break;
            }
        }
    }
}