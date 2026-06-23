package A8_Basic_Sorting;

public class PushZeroToEnd {
    public static void pushZeroToEnd(int [] arr) {
        int n = arr.length;
        int idx =0;
        for(int i = 0 ;i<n;i++){
            if(arr[i]!=0){
                arr[idx]=arr[i];
                idx++;
            }
        }
        for(int i = idx ;i<n;i++){
            arr[i]=0;
        }
    }
    public static void main(String[] args) {
        int []arr = {1,2,3,4,0,5,0,9,4,0,8,9,10};
        pushZeroToEnd(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
