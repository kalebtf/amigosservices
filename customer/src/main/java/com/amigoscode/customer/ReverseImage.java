package com.amigoscode.customer;

public class ReverseImage {

    public static void main(String[] args) {
        int[][] matrix =  { {1,2,3}, {4,5,6}, {7,8,9}};

        rotate(matrix);
        int N = matrix.length;

        for (int i = 0; i < N; i++){

            for (int j = 0; j < N; j++){
                System.out.print(matrix[i][j]);
            }

            System.out.println("");
        }
    }

    public static int[][]  rotate(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j < Math.ceil(((double) n) / 2); j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n-1-j][i];
                matrix[n-1-j][i] = matrix[n-1-i][n-1-j];
                matrix[n-1-i][n-1-j] = matrix[j][n-1-i];
                matrix[j][n-1-i] = temp;
            }
        }

        return matrix;
    }


}
