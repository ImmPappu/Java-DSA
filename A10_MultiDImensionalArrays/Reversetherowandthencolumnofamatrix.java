package MultiDImensionalArrays;

public class Reversetherowandthencolumnofamatrix {
   public static void main(String[] args) {
        int[][] arr = {
                {2, 8, 3, 4},
                {7, 2, 1, 6},
                {5, 5, 4, 1},
                {3, 1, 8, 2}
        };
        //Row Reverse
        int n = arr.length;
     for(int i= 0; i< n; i++){
          int left =0;
          int right =n-1;
          while(left<right){
              int temp = arr[i][left];
              arr[i][left] = arr[i][right];
              arr[i][right] = temp;
              left++;
              right--;
         }
     }
     //Column Reverse
        for(int j= 0; j< n; j++){
            int top =0;
            int bottom =n-1;
            while(top<bottom){
                int temp = arr[top][j];
                arr[top][j] = arr[bottom][j];
                arr[bottom][j] = temp;
                top++;
                bottom--;
            }
        }
        for(int [] a : arr){
            for(int ele :a){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
    }
}
