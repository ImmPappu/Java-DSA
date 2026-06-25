package MultiDImensionalArrays;

import java.util.ArrayList;

public class PascalTriangle {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();

        for (int i = 0; i <= 4; i++) {
            arr.add(new ArrayList<>()); // 4 khali arraylist

            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) arr.get(i).add(1);
                else arr.get(i).add(arr.get(i-1).get(j-1) + arr.get(i-1).get(j));
            }
        }
        for(ArrayList<Integer> list : arr){
            for(int i : list){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
