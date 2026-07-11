package A10_MultiDImensionalArray;

public class TransposeOfNewRectangularMatrix {
    public static void main(String[] args) {
        int [][] arr ={
                {2,8,3,4},
                {7,2,1,6},
        };
        int [][] brr = new int [arr[0].length][arr.length];
        for(int i=0;i<arr.length;i++) {
            for (int j = 0; j < arr[0].length; j++) { //Remember star triangle loop
                brr[j][i] = arr[i][j];
            }
        }
        for(int i=0;i<brr.length;i++){
            for(int j=0;j<brr[i].length;j++){
                System.out.print(brr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
