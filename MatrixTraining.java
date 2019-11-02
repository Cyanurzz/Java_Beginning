public class MatrixTraining {

    /**
     * @param lines   height of the matrix, eg: 3
     * @param columns width of the matrix, eg: 2
     * @return an empty int matrix of lines and columns size, eg: {{0, 0}, {0, 0},
     *         {0, 0}}
     */
    public int[][] emptyIntMatrix(int lines, int columns) {
        int[][] arr = new int[lines][columns];
        return arr;
    }

    /**
     * @param lines   height of the matrix, eg: 2
     * @param columns width of the matrix, eg: 3
     * @return an empty string matrix of lines and columns size, eg: {{null, null,
     *         null}, {null, null, null}}
     */
    public String[][] emptyStringMatrix(int lines, int columns) {
        String[][] arr = new String[lines][columns];
        for (int i = 0; i > lines; i++) {
            for (int j = 0; j > columns; j++) {
                arr[i][j] = null;
            }
        }
        return arr;

    }

    /**
     * @param a first array
     * @param b second array
     * @param c third array
     * @return an int matrix with a, b and c arrays
     */
    public int[][] intMatrix(int[] a, int[] b, int[] c) {
        int[][] arr = new int[][] { a, b, c };
        return arr;
    }

    /**
     * @param a first array
     * @param b second array
     * @param c third array
     * @return a String matrix with a, b and c arrays
     */
    public String[][] stringMatrix(String[] a, String[] b, String[] c) {
        String[][] arr = new String[][] { a, b, c };
        return arr;
    }

    /**
     * @param matrix, eg: {{3, 4}, {6, 7}, {5, 8}}
     * @return number of matrix lines, eg: 3
     */
    public int height(int[][] matrix) {
        int res = matrix.length;
        return res;
    }

    /**
     * @param matrix, eg: {{3, 4}, {6, 7}, {5, 8}}
     * @return number of matrix columns, eg: 2
     */
    public int width(int[][] matrix) {
        int res = matrix[0].length;
        return res;
    }

    /**
     * @param matrix, eg: {{3, 4, 5}, {6, 7, 8}}
     * @param line,   eg: 1
     * @param column, eg: 0
     * @return value in matrix at line and column, eg: 6
     */
    public int valueAtPosition(int[][] matrix, int line, int column) {
        int res = matrix[line][column];
        return res;
    }

    /**
     * @param matrix, eg: {{1, 2, 3}, {8, 5, 6}}
     * @param value,  eg: 4
     * @param line,   eg: 1
     * @param column, eg: 0
     * @return the matrix with the value replaced at line and column, eg: {{1, 2,
     *         3}, {4, 5, 6}}
     */
    public int[][] replace(int[][] matrix, int value, int line, int column) {
        matrix[line][column] = value;
        return matrix;
    }

    /**
     * @param matrix, eg: {{1, 2, 3}, {4, 5, 6}}
     * @return sum of matrix values, eg: 21
     */
    public int sum(int[][] matrix) {

        int res = 0;
        for (int[] line : matrix) {
            for (int column : line) {
                res += column;
            }
        }
        return res;
    }

    /**
     * @param matrix, eg: {{1, 2, 3}, {4, 5, 6}}
     * @param search, eg: 5
     * @return if matrix contains searched value, eg: true
     */
    public boolean contains(int[][] matrix, int search) {
        boolean res = false;
        for (int[] line : matrix) {
            for (int column : line) {
                if (column == search) {
                    res = true;
                }
            }
        }
        return res;
    }

    /**
     * @param matrix, eg: {{1, 2, 3}, {4, 5, 6}}
     * @return how many even numbers are in matrix, eg: 3
     */
    public int countEvens(int[][] matrix) {
        int res = 0;
        for (int[] line : matrix) {
            for (int column : line) {
                if (column % 2 == 0) {
                    res += 1;
                }
            }
        }
        return res;
    }

    /**
     * @param matrix, eg: {{'d', 'b', 'a'}, {'a', 'd', 'a'}}
     * @param search, eg: 'a'
     * @return the number of character occurrences in matrix, eg: 3
     */
    public int occurrences(char[][] matrix, char search) {
        int res = 0;
        int lenLine = matrix.length;
        for (int i = 0; i < lenLine; i++) {
            int lenCol = matrix[i].length;
            for (int j = 0; j < lenCol; j++) {
                char test = matrix[i][j];
                if (test == search) {
                    res += 1;
                }
            }
        }
        return res;
    }
}
