package A10_MultiDImensionalArray;

import java.util.ArrayList;
import java.util.List;

public class TwoDArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(1); arr1.add(2); arr1.add(3); arr1.add(4);
        ArrayList<Integer> arr2 = new ArrayList<>();
        arr2.add(5); arr2.add(6); arr2.add(6);
        ArrayList<Integer> arr3 = new ArrayList<>();
        arr3.add(7); arr3.add(8);

        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        arr.add(arr1); arr.add(arr2); arr.add(arr3);

//        for (int i = 0; i < arr.size(); i++) {
//            for (int j = 0; j < arr.get(i).size(); j++) {
//                System.out.print(arr.get(i).get(j)+" ");
//            }
//            System.out.println();
//        }

        arr.add(new ArrayList<>());
        arr.get(arr.size()-1).add(10);  arr.get(arr.size()-1).add(20);
        for (ArrayList<Integer> list : arr ) {
            for(int ele :list){
                System.out.print(ele+ " ");
            }
            System.out.println();
        }
    }
}
