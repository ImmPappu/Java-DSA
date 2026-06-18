package A6_Array;

public class SecondMaximumElementInArray {
    static void main(String[] args) {
        int arr[] = {10,10,10};
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        //For max
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
            //For Second max
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > smax && arr[i] != max)  smax = arr[i];


            }
            System.out.println(max);
            System.out.println(smax);
        }
    }

