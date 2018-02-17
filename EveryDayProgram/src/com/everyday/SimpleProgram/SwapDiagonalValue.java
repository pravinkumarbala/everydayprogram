package com.everyday.SimpleProgram;

public class SwapDiagonalValue {
    static int N = 3;

    static void swapDiagonal(int matrix[][]){
        for (int i = 0 ; i < N ; i ++){
            int temp = matrix[i][i];
            matrix[i][i] = matrix[i][N - i - 1];
            matrix[i][N - i - 1] = temp;
        }
    }

    public static void main(String[] args) {
        int count = 0;
        int[][] matrix = new int[N][N];

        for (int i = 0 ; i < N ; i ++)
            for (int j = 0 ; j < N ; j ++)
                matrix[i][j] = count++ ;

        System.out.println("Before Swapping");

        for (int i = 0 ; i < N ; i ++){
            for (int j = 0 ; j < N ; j ++)
                System.out.print(matrix[i][j] + " ");
            System.out.println();
        }
        swapDiagonal(matrix);
        System.out.println("After Swapping");

        for (int i = 0 ; i < N ; i ++){
            for (int j = 0 ; j < N ; j ++)
                System.out.print(matrix[i][j] + " ");
        System.out.println();
        }
    }

}
