package LinearEquationSolver;

/**
 * This class is actually the main class. It gets an equation system and a solution method.
 * After setting these variables, it solves the equation system with using given method.
 */
public class LinearEquationSolver {
    private LinearEquationSystem equationSystem = null;
    private SolvingMethod solvingMethod = null;

    /**
     * Empty constructor. If this constructor is called, you should call setter methods too.
     */
    public LinearEquationSolver() {
    }

    /**
     * Default constructor. It gets the system and the method.
     * @param system linear equation system
     * @param method solving method
     */
    public LinearEquationSolver(LinearEquationSystem system, SolvingMethod method) {
        setEquationSystem(system);
        setSolvingMethod(method);
    }

    /**
     * Sets equation system.
     * @param system linear equation system
     */
    public void setEquationSystem(LinearEquationSystem system) {
        equationSystem = system;
    }

    /**
     * Sets solving method.
     * @param method solving method
     */
    public void setSolvingMethod(SolvingMethod method) {
        solvingMethod = method;
    }

    /**
     * If equation system and solving method is set, it calls solve method of solving method.
     * Else prints an error that indicates which parameter is missing.
     */
    public void run() {
        if (equationSystem != null && solvingMethod != null) {
            solvingMethod.solve(equationSystem);
        } else {
            if (equationSystem == null) {
                System.out.println("Please, provide an equation system!");
            }
            if (solvingMethod == null) {
                System.out.println("Please, provide a solution method!");
            }
        }
    }
}