package A13_MergeSort;

public class InversionCount {
    static int count;
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 4, 1, 6, 7, 3};
        count = 0;
        MergeSort(arr);

        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println(count);
    }

    public static void MergeSort(int[] arr) {
        int n = arr.length;
        if(n==1) return;

        //Array ko two equal part mei tod do
        int [] a = new int[n/2];
        int [] b = new int[n-n/2];
        int idx = 0;
        //new array mei original array ke element copy-paste karo
        for(int i = 0; i <a.length; i++) a[i] = arr[idx++];
        for(int i = 0; i <b.length; i++) b[i] = arr[idx++];
        //MergeSort ka Magic
        MergeSort(a);
        MergeSort(b);
        //Applying that mergesort jo ki 2 sorted array ko merge karne ke liye use kiya gya tha
        Merge(a,b,arr);
    }

    public static void Merge(int[] a, int[] b, int[] arr) {
        int i = 0, j = 0 , k = 0;
        while(i<a.length && j<b.length) {
            if(a[i]<=b[j]) arr[k++] = a[i++] ;
            else {
                count = count + (a.length-i);    // count karegi agar staring wale se bada yani uske baad wale se bhi bada hoga
                arr[k++] = b[j++] ;
            }
        }
        while(i<a.length) arr[k++] = a[i++] ;
        while(j<b.length) arr[k++] = b[j++] ;
    }
}
