package A6_Array;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListInJavaBasic {
    static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(3);
        arr.add(4);

        System.out.println(arr.get(1));

        arr.set(1, 5);
        System.out.println(arr.get(1));

        System.out.println(arr);

        arr.add(1,45);
        System.out.println(arr);

        arr.remove(1);
        System.out.println(arr);

        Collections.reverse(arr);
        System.out.println(arr);

        int i =0 , j= arr.size()-1;
        while(i<j){
            int temp = arr.get(i);
            arr.set(i, arr.get(j));
            arr.set(j, temp);
            i++;
            j--;
        }
    }
}
