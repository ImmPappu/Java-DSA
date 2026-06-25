package MultiDImensionalArrays;

public class Rotateby90Degree {
    public static void main(String[] args) {
        int[][] arr = {
                {2, 8, 3, 4},
                {7, 2, 1, 6},
                {5, 5, 4, 1},
                {3, 1, 8, 2}
        };
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        //for Column
        for (int j = 0; j < n; j++) {
            int top = 0;
            int bottom = n - 1;

            while (top < bottom) {

                int temp = arr[top][j];
                arr[top][j] = arr[bottom][j];
                arr[bottom][j] = temp;

                top++;
                bottom--;
            }
        }
    }
}
//        int [][] brr = new int [n][n];
//        for(int i=0;i<n;i++) {
//            for ( int j=0;j<n;j++) {
//                   brr[i][j] = arr[n-j-1][i];
//            }
//        }
//        for(int i=0;i<n;i++){
//            for(int j=0;j<n;j++){
//                System.out.print(brr[i][j]+" ");
//            }
//            System.out.println();
//        }

// Trick Yaad Rakho
//  Clockwise 90° = Transpose + Reverse Rows
//  Anti-Clockwise 90° = Transpose + Reverse Columns
//                   brr[0][0] = arr[3][0];
//                   brr[0][1] = arr[2][0];
//                   brr[0][2] = arr[1][0];
//                   brr[0][3] = arr[0][0];
//                   brr[1][0] = arr[3][1];
//                   brr[1][1] = arr[2][1];
//                   brr[1][2] = arr[1][1];
//                   brr[1][3] = arr[0][1];
//                   brr[2][0] = arr[3][2];
//                   brr[2][1] = arr[2][2];
//                   brr[2][2] = arr[1][2];
//                   brr[2][3] = arr[0][2];
//                   brr[3][0] = arr[3][3];
//                   brr[3][1] = arr[2][3];
//                   brr[3][2] = arr[1][3];
//                   brr[3][3] = arr[0][3];
