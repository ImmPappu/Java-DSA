package MultiDImensionalArrays;

public class SumOfAllElement {
    static void main(String[] args) {
        int [][] arr = {{6,5,8,6,9},{1,0,8,9,9},{7,8,6,9,4}};
        int sum =0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++) {
                sum = sum + arr[i][j];
            }
        }
        System.out.println("the sum is "+sum);
    }
}
