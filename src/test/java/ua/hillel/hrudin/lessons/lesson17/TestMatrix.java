package ua.hillel.hrudin.lessons.lesson17;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestMatrix {
   @Test
    void testGetAverageFromArrayNull() {
        Assertions.assertEquals(-1,Matrix.getAverageFromArray(null));
    }
    @Test
    void testGetAverageFromArray() {
        Assertions.assertEquals(4, Matrix.getAverageFromArray(new int[]{4, 4, 4}));
    }
    @Test
    void testGetAverageFromArrayZero() {
        Assertions.assertEquals(0, Matrix.getAverageFromArray(new int[0]));
    }
    @Test
    void testMatrixSquare() {
       Assertions.assertTrue(Matrix.isMatrixSquare(new int [4][4]));
    }
    @Test
    void testMatrixSquareNull() {
       Assertions.assertFalse(Matrix.isMatrixSquare(null));
    }
    @Test
    void testMatrixSquareNegative() {
        Assertions.assertFalse(Matrix.isMatrixSquare(new int [][] {
                {3,5,9},
                {9,0,0,0},
                {0,0}
        }));
    }

}
