package CyclicSort;

public class MissingNumberInArrayUsingCyclicSort {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 8, 3, 6, 7, 4, 9};
        Missingarray(arr);
        System.out.println(Missingarray(arr));
    }

        public static int Missingarray(int[] arr){
        int n = arr.length ;
        int i = 0;
        while (i < arr.length) {
            if (arr[i] == i + 1 || arr[i] == n || arr[i] == arr[arr[i]-1]) i++;
            else {
                int idx = arr[i] - 1;
                swaps(arr, i, idx);
            }

        }
            for(i=0;i<n;i++){
                if(arr[i]!=i+1) return i+1;
            }
            return n;
    }

    public static void swaps(int[] arr, int i, int idx) {
        int temp = arr[i];
        arr[i] = arr[idx];
        arr[idx] = temp;
    }
}
