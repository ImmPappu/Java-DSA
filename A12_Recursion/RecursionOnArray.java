package A12_Recursion;

public class RecursionOnArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int target =5;
//      numbers(arr,0);
        System.out.println(exist(arr,target, 0));

    }

    public static boolean exist(int[] arr, int target, int idx) {
        if (idx == arr.length) return false;
        if (arr[idx] == target) return true;
        return exist(arr, target, idx + 1);


//    public static void numbers(int [] arr ,int idx){
//        if(idx==arr.length){
//            return;
//        }
//        System.out.print(arr[idx]+" ");
//           numbers(arr,idx+1);
//
//
//    }
    }
}
