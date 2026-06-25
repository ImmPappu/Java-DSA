package MultiDImensionalArrays;
import java.util.Scanner;

public class takingInputIn2DArray {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int row = sc.nextInt();
        int col = sc.nextInt();
        int [][] arr = new int[row][col];

        System.out.println("Enter the elements in the array: ");
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Array is: ");
        for(int i =0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
