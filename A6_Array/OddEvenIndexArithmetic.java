package A6_Array;

public class OddEvenIndexArithmetic {
    public static void main(String[] args) {
        int [] arr = {564,54,5,45,2,5,15};

        for(int i=0;i<arr.length;i++) {
            if (i % 2 == 0) {
                arr[i] = arr[i] + 10;
            } else {
                arr[i] = arr[i] * 2;
            }

            System.out.print(arr[i]+" ");
        }
        }

    }


