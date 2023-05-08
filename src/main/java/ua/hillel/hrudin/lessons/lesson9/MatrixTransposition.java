package ua.hillel.hrudin.lessons.lesson9;

import java.util.Scanner;

public class MatrixTransposition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = 0;
        int N = 0;
        for (int i = 0; i < 1; i++) {
            System.out.println("Enter integer to M:");
            if (sc.hasNextInt()){
                M = sc.nextInt();
                if (M <= 0) {
                    System.out.println("Wrong integer, try again!");
                    i--;
                }
            }else {
                System.out.println("Wrong integer, try again!");
                i--;
            }
            sc.nextLine();
        }
        for (int i = 0; i < 1; i++) {
            System.out.println("Enter integer to N:");
            if (sc.hasNextInt()) {
                N = sc.nextInt();
                if (N <= 0) {
                    System.out.println("Wrong integer, try again!");
                    i--;
                }
            } else {
                System.out.println("Wrong integer, try again!");
                i--;
            }
            sc.nextLine();
        }
        System.out.println("Matrix M*N:");
        int[][] matrix = new int[M][N];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 101);
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println(" ");
        }
        int[][] matrix1 = new int[N][M];
        System.out.println("Matrix N*M:");
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                matrix1[i][j] = matrix[j][i];
            }
        }
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                System.out.print(matrix1[i][j] + "\t");
            }
            System.out.println(" ");
        }

    }
}
