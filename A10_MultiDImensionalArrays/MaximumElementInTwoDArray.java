package MultiDImensionalArrays;

public class MaximumElementInTwoDArray {
   public static void main(String[] args) {
        int [][] arr = {{6,5,8,6,9},{1,0,8,45,9},{7,8,6,9,4}};
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++) {
                if(arr[i][j]>max){
                    max=arr[i][j];
                }
            }
        }
        System.out.println("The maximum element is : "+max);
    }
}
