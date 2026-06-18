package A6_Array;

public class MergeOfTwoSortedArray {
    public static void main(String[] args) {
        int[] a = {5, 6, 9, 45, 78};
        int[] b = {1, 2, 3, 4};
        int[] c = new int[a.length + b.length];
        merge(a, b, c);
        for (int ele : c) {
            System.out.print(ele + " ");
        }
    }

    public static void merge(int[] a, int[] b, int[] c) {
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) c[k++] = a[i++];
            else c[k++] = b[j++];
        }
            while (i < a.length) { // b array khatam ho jaye -> a ke ele lo
                c[k++] = a[i++];
        }
            while (j < b.length) {  //  a array khatam ho jaye -> b ke bache hue ele lo
                c[k++] = b[j++];
        }
    }
}


