package LinearEquationSolver;

/**
 * This class includes most common matrix operations.
 * Assume that matrices are double[][].
 */
public class MatrixOperations {

    /**
     * Empty constructor. No need to create an object of this class.
     */
    public MatrixOperations() {
    }

    /**
     * This method finds inverse of a matrix if it exist, then return it an throw exception.
     * @param matrix matrix
     * @return inverse matrix
     * @throws Exception if matrix has no inverse
     */
    public static double[][] getInverse(double[][] matrix) throws Exception {
        double[][] result;
        double determinant;

        if (matrix.length == 1) {
            if (matrix[0][0] == 0) {
                throw new Exception("Division by zero!");
            }

            result = new double[1][1];
            result[0][0] = 1.0 / matrix[0][0];
            return result;
        }

        determinant = getDeterminant(matrix);
        if (determinant == 0) {
            throw new Exception("No inverse matrix!");
        }

        result = multiplyByConstant(getTranspose(getCofactor(matrix)), 1.0 / determinant);
        return result;
    }

    /**
     * This method finds transpose of a matrix.
     * @param matrix matrix
     * @return transpose matrix
     */
    public static double[][] getTranspose(double[][] matrix) {
        int rowCount = matrix.length;
        int columnCount = matrix[0].length;
        double[][] transposedMatrix = new double[columnCount][rowCount];

        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < columnCount; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }
        return transposedMatrix;
    }

    /**
     * This method calculates determinant of a matrix.
     * @param matrix matrix
     * @return determinant of matrix
     * @throws Exception if matrix is not square
     */
    public static double getDeterminant(double[][] matrix) throws Exception {
        if (matrix.length != matrix[0].length) {
            throw new Exception("This matrix is not square!");
        }

        if (matrix.length == 1) {
            return matrix[0][0];
        } else if (matrix.length == 2) {
            return (matrix[0][0] * matrix[1][1]) - (matrix[0][1] * matrix[1][0]);
        }  else {
            double sum = 0;
            for (int i = 0; i < matrix.length; i++) {
                sum += changeSign(i) * matrix[0][i] * getDeterminant(createSubMatrix(matrix, 0, i));
            }
            return sum;
        }
    }

    /**
     * This method finds cofactor of a matrix.
     * @param matrix matrix
     * @return cofactor of matrix
     * @throws Exception if matrix is not square
     */
    public static double[][] getCofactor(double[][] matrix) throws Exception {
        int rowCount = matrix.length;
        int columnCount = matrix[0].length;
        double[][] minorMatrix = new double[rowCount][columnCount];

        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < columnCount; j++) {
                minorMatrix[i][j] = changeSign(i) * changeSign(j) * getDeterminant(createSubMatrix(matrix, i, j));
            }
        }
        return minorMatrix;
    }

    /**
     * This method creates a subMatrix by extracting given row and column.
     * @param matrix matrix
     * @param row which row will extract
     * @param column which column will extract
     * @return subMatrix
     * @throws Exception if matrix is smaller than 2x2
     */
    public static double[][] createSubMatrix(double[][] matrix, int row, int column) throws Exception {
        int r, c;
        int rowCount = matrix.length;
        int columnCount = matrix[0].length;

        if (rowCount <= 1 || columnCount <= 1) {
            throw new Exception("This matrix is to small. It should be equal or bigger than 2x2.");
        }

        double[][] subMatrix = new double[rowCount - 1][columnCount - 1];

        r = 0;
        for (int i = 0; i < rowCount; i++) {
            if (i == row) {
                continue;
            }

            c = 0;
            for (int j = 0; j < columnCount; j++) {
                if (j == column) {
                    continue;
                }
                subMatrix[r][c++] = matrix[i][j];
            }
            r++;
        }
        return subMatrix;
    }

    /**
     * This method multiplies given matrix by a constant.
     * @param matrix matrix
     * @param constant constant value
     * @return product matrix
     */
    public static double[][] multiplyByConstant(double[][] matrix, double constant) {
        int rowCount = matrix.length;
        int columnCount = matrix[0].length;
        double[][] newMatrix = new double[rowCount][columnCount];

        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < columnCount; j++) {
                newMatrix[i][j] = matrix[i][j] * constant;
            }
        }
        return newMatrix;
    }

    /**
     * This method multiplies two matrices.
     * @param matrix1 matrix 1
     * @param matrix2 matrix 2
     * @return product matrix
     */
    public static double[][] multiply(double[][] matrix1, double[][] matrix2) {
        int common = matrix1[0].length;
        int rowCount = matrix1.length;
        int columnCount = matrix2[0].length;
        double[][] result = new double[rowCount][columnCount];
        double sum;

        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < columnCount; j++) {
                sum = 0;
                for (int k = 0; k < common; k++) {
                    sum += matrix1[i][k] * matrix2[k][j];
                }
                result[i][j] = sum;
            }
        }
        return result;
    }

    /**
     * This method is a helper.
     * @param i integer
     * @return 1 or -1
     */
    private static int changeSign(int i) {
        if (i % 2 == 0) {
            return 1;
        }
        return -1;
    }
}