package A8_Basic_Sorting;

public class InsertionSortAlogirthm {
    public static void main(String[] args) {
        int[] arr = {4,1,78,31,56,48,6,7,8};
        for (int i = 0;i<arr.length;i++){
            int j =i;
            while(j>0 && arr[j]<arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
    }
}
// Time Compelxity of Insertion Sort
//Best Case : O(n)  Array is already sorted
//Average Case : O(n'2)
//Worst Case : O(n'2) n(n-1)/2  Array is sorted in descending order