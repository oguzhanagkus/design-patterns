package LinearEquationSolver;

/**
 * This is an interface for solving methods.
 * It has only solve method.
 */
public interface SolvingMethod {

    /**
     * Solve method definition, each solving method should implement it.
     * @param equationSystem represents which equation system will be solved
     */
    void solve(LinearEquationSystem equationSystem);
}