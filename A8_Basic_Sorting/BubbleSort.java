package A8_Basic_Sorting;

public class BubbleSort {
   public static void main(String[] args) {
        int[] arr = {5,8,6,4,-8,6};
        int n = arr.length;

//        for (int i = 0; i < n-1; i++) {
//
//            for (int j = 0; j < n-i-1; j++) {
//                if (arr[j] > arr[j+1]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                }
//            }
//        }

        //Better Approach In Bubble Sort

       for (int i = 0; i < n-1; i++) {  // n-1 passes
         int swap = 0;
           for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                   swap++;
                }
            }
           if(swap==0)break;   //yahi andar ka loop swaping hui hi nhi matlab pehle se sorted hai
        }
        for ( int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}
