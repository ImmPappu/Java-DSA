package A10_MultiDImensionalArray;

import java.util.ArrayList;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4, 5},
                {16, 17, 18, 19, 6},
                {15, 24, 25, 20, 7},
                {14, 23, 22, 21, 8},
                {13, 12, 11, 10, 9},
        };
        SpiralMatrix obj = new SpiralMatrix();
        ArrayList<Integer> ans = obj.Spiral(arr);
        System.out.println(ans);
    }


    public ArrayList<Integer> Spiral(int[][] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        int row = arr.length;
        int col = arr[0].length;
        int fc = 0;
        int lc = col - 1;
        int fr = 0;
        int lr = row - 1;
        while (fr <= lr && fc <= lc) {
            for (int i = fc; i <= lc; i++) {
                ans.add(arr[fr][i]);
            }
            fr++;
            for (int i = fr; i <= lr; i++) {
                ans.add(arr[i][lc]);
            }
            lc--;
            if (fr <= lr) {
                for (int i = lc; i >= fc; i--) {
                    ans.add(arr[lr][i]);
                }
                lr--;
            }
            if (fc <= lc) {
                for (int i = lr; i >= fr; i--) {
                    ans.add(arr[i][fc]);
                }
                fc++;
            }
        }
        return ans;

    }
}
