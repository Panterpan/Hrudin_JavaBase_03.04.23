package ua.hillel.hrudin.lessons.lesson17;

public class Matrix {
    public static double getAverageFromArray(int[] array) {
        double summ = 0;
        if (array == null) {
            return -1;
        }
        if (array.length == 0) {
            return 0;
        }

        for (int i = 0; i < array.length; i++) {
            summ += array[i];
        }
        return summ/array.length;
    }

    public static boolean isMatrixSquare(int[][] matrix) {
        if (matrix == null) {
            return false;
        }
        for (int i = 0; i < matrix.length; i++) {
            if (matrix.length != matrix[i].length) {
                return false;
            }
        }
        return true;
    }
}
