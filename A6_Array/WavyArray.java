package A6_Array;

public class WavyArray {
    static void main(String[] args) {
        int[] arr = {-2, 11, 15, 17};
        for (int i = 0; i < arr.length - 1; i += 2) {

            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i]+" ");
    }
}
