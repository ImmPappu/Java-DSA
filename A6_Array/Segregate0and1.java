package A6_Array;

public class Segregate0and1 {
    static void main(String[] args) {
        int arr[] = {0, 1, 0, 1, 0, 1, 1, 0};
//        int numberOfZero = 0;
//        int numberOfOne = 0;
//        for (int ele : arr) {
//            if (ele == 0) {
//                numberOfZero++;
//            } else numberOfOne++;
//        }
//        for (int i = 0; i < numberOfZero; i++) {
//            arr[i] = 0;
//            System.out.print(arr[i] + " ");
//        }
//        for (int i = numberOfZero; i < arr.length; i++) {
//            arr[i] = 1;
//            System.out.print(arr[i] + " ");
//        }

        // by swapping Technique
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            if (arr[left] == 0) {
               left++;
            }
            else if (arr[right] == 1) {
                right--;
            }
            else {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }
            for (int ele : arr) {
                System.out.print(ele + " ");
            }
        }
}
