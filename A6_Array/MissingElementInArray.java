package A6_Array;

public class MissingElementInArray {

   public static int missingNum(int arr[]){
        long n = arr.length+1;
        long sum = n*(n+1)/2;
        long arrSum=0;
        for ( int ele : arr){
            arrSum+=ele;
        }
        return (int)(sum - arrSum);
    }
    //                Arrays.sort(arr);
//                int n = arr.length +1 ;  // n-1 = arr.length
//
//                for (int i = 0; i < n-1 ; i++) {
//                     if (arr[i] != i+1) {
//                        return i+1;
//                    }
//                }
//               return n ;
//
   public static void main(String[] args) {
    int [] arr = {1,3,4,6,5};
    int ans = missingNum(arr);
       System.out.println(ans);





    }
}
