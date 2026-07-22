package MultiDImensionalArrays;

public class MinimumElementOfAllMaximumOfEachRow {
    static void main(String[] args) {
        int[][] arr = {{6, 5, 8, 6, 9}, {1, 0, 8, 45, 9}, {7, 8, 6, 9, 4}, {7, 15, 6, 9, 4}};
        int min = Integer.MIN_VALUE;
        int row = -1;
        for (int i = 0; i < arr.length; i++) {
            int max = Integer.MIN_VALUE;

            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
            if (max > min) {
                min = max;
                row = i;
            }
        }
        System.out.println(row+" "+min );
    }
}
