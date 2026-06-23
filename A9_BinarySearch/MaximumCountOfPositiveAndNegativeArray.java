package A9_BinarySearch;
import java.util.Arrays;

public class MaximumCountOfPositiveAndNegativeArray {
  public static void main(String[] args) {
    int[] arr = {-9, -7, -4, 1, 5, 8, 9};
    // Function call
    //System.out.println(Maximum(arr));
  }

  //T.C - O(log n)
  public int maximumCount(int[] arr) {
    //for Negaitve Counts
    int n = arr.length;
    int low = 0;
    int high = n-1;
    while(low<=high){
      int mid = low +(high-low)/2;
      if(arr[mid]>=0){
        high = mid-1;
      }
      else low = mid +1;

    }
    int negativecount = low;

    //for Positive Counts
    low = 0;
    high = n-1;
    while(low<=high){
      int mid = low +(high-low)/2;
      if(arr[mid]<=0){
        low = mid + 1;
      }
      else  high = mid - 1;

    }
    int poscount=n-low;
    if(negativecount>=poscount) return negativecount ;
    else return poscount;
  }






     //T.C - O(n);
//   public  static int Maximum(int[] arr) {
//      int Positive = 0, Negative = 0;
//      for (int num : arr) {
//        if (num > 0)
//          Positive++;
//        else if (num < 0)
//          Negative++;
//      }
//      return Math.max(Positive, Negative);
//    }
  }

