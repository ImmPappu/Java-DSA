package MultiDImensionalArrays;

public class RowWithMaximumSum {
    static void main(String[] args) {
        int [][] arr = {{6,5,8,6,9},{1,0,8,45,9},{7,8,48,9,4}};
        int maxSum = Integer.MIN_VALUE;
        int row = -1;
        for(int i=0;i<arr.length;i++){
            int sum =0;
            for(int j=0;j<arr[0].length;j++) {
                sum = sum + arr[i][j];
            }
             if(sum>maxSum){
                 maxSum=sum;
                 row=i;
             }
        }
        System.out.println(row+" "+maxSum );

    }
    }

