package A8_Basic_Sorting;
 import java.util.ArrayList;
public class UnionOfTwoSortedArray {
    static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int[] b = {1,2,3,5,6,8,9};
        ArrayList<Integer> ans = new ArrayList<>();
        int i = 0, j = 0;

        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                if (ans.isEmpty() || ans.getLast() != a[i])
                    ans.add(a[i]);
                i++;
            }
            else if (a[i] > b[j]) {
                if (ans.isEmpty() || ans.getLast() != b[j])
                    ans.add(b[j]);
                j++;
            }
            else {
                if (ans.isEmpty() || ans.getLast() != a[i])
                    ans.add(a[i]);
                i++;
                j++;
            }
        }
        while (i < a.length) {
            if (ans.isEmpty() || ans.getLast() != a[i])
                ans.add(a[i]);
            i++;
        }
        while (j < b.length) {
            if (ans.isEmpty() || ans.get(ans.size() - 1) != b[j])
                ans.add(b[j]);
            j++;
        }
        System.out.print(ans);
    }
}
