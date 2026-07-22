package A12_Recursion;

public class CountInversion_MergeSort {
       static int count;
       public static void main(String[] args){
            count = 0;
            int[] arr = {2, 4, 1, 3, 5};
            MergeSort(arr);
            for (int ele : arr){
                System.out.print(ele + " ");
            }
           System.out.println();
           System.out.println(count);

        }

        public static void MergeSort(int[] arr) {
            int n = arr.length;
            int idx = 0;

            if(n==1) return;

            int [] a = new int[n/2];
            int [] b = new int[n-n/2];


            for(int i = 0; i <a.length; i++) a[i] = arr[idx++];
            for(int i = 0; i <b.length; i++) b[i] = arr[idx++];

            MergeSort(a);
            MergeSort(b);

            Merge(a,b,arr);
        }

        public static void Merge(int[] a, int[] b, int[] arr) {
            int i = 0, j = 0 , k = 0;
            while(i<a.length && j<b.length) {
                if(a[i]<=b[j]) arr[k++] = a[i++] ;
                else {
                    arr[k++] = b[j++] ;
                    count = count + (a.length-i);    // Yha pehle arr.length likha tha tab answer 9
                }                                    //aaya tha tab code debug kiya toh pata chala ki a ke length mei se minus karna tha
            }
            while(i<a.length) arr[k++] = a[i++] ;
            while(j<b.length) arr[k++] = b[j++] ;
        }
    }

