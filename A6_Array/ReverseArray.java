package A6_Array;

public class ReverseArray {
    static void main(String[] args) {
//        int arr[] = {6,8,1,8,4,9};
//        int n = arr.length;
//        for(int i=n-1;i>=0;i--){
//            System.out.print(arr[i]+" ");  //This will print the elements in reverse order
//        }

           //For actually reversing the array
           //using two pointer echnique
        int arr[] = {6,8,1,8,4,9};

        int left = 0;               // left = 2   agar sirf 1 aur 8
        int right = arr.length-1;   // right = 3; ko swap karna hai
        while(left<right){
            int temp = arr[left];
            arr[left] =arr[right];
            arr[right] =temp;

            left++;
            right--;

        }
        for(int ele : arr){
            System.out.print(ele+" ");
        }



    }
}
