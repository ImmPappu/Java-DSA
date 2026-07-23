package A14_CyclicSort;

public class FirstMissingPositiveArray {
    static void main(String[] args) {
    int[] arr ={7,8,9,11,12};
    firstMissingPositive(arr);
        System.out.println(firstMissingPositive(arr));


    }
    public static int firstMissingPositive(int[] arr) {
        int n = arr.length;
        int i= 0;
        while (i < arr.length) {
            if (arr[i]>n || arr[i]<=0 || arr[i] == arr[arr[i]-1] ||arr[i]==i+1) i++;
            else swap(arr,i,arr[i]-1);
        }
        for(i=0;i<n;i++){
            if(arr[i]!=i+1) return i+1;
        }
        return n+1;
    }
    public static void swap(int[] arr,int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
