package A6_Array;

public class MergeOfTwoSortedArrrayInReverse {
  public  static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {4, 5, 6, 7, 8,9};
        int[] c = new int[a.length + b.length];
        reverseMerge(a,b,c);
        for( int ele : c){
            System.out.print(ele+" ");
        }
    }

    public  static void reverseMerge(int[] a, int[] b , int [] c) {
       int i = a.length-1, j = b.length-1,k = c.length-1;
       while(i>=0 && j>=0) {
           if (a[i] > b[j]) {
               c[k--] = a[i--];
           } else {
               c[k--] = b[j--];
           }
       }
               while (i >= 0) {
                   c[k--] = a[i--];
               }
               while (j >= 0) { 
                   c[k--] = b[j--];
           }
       }
}
