package MultiDImensionalArrays;

import java.util.ArrayList;

public class MatrixMultiplication {
     static void main(String[] args) {
         int [][] mat2 = {
                 {4,6},
                 {1,3},
         };
         int [][] mat1 = {
                 {1,2},
                 {4,5},
         };
         int row1 = mat1.length;
         int col1 = mat1[0].length;
         int col2 = mat2[0].length;
        int[][] sum = new int[row1][col2];


        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                for (int k = 0; k < col1; k++) {
                    sum[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }
        for(int i = 0; i < row1; i++){
            for(int j = 0; j < col2; j++){
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }

    }
}
