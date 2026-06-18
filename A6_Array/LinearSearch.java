package A6_Array;

public class LinearSearch {
    static void main(String[] args) {
        int[] arr = {41, 65, 84, 66, 78};
        int target = 65;
       int found = -1;  // Any Negative values mean array mei nhi hai
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                found = i;  //any number except -1 matlab array mei hai
                break;
            }
        }
        if (found!=-1) System.out.println(" Element found at index " + found);
        else System.out.println("Element not found");
    }
}