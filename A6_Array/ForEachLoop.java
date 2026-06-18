package A6_Array;

public class ForEachLoop {
    static void main(String[] args) {
//        int arr [] = {4,5,8,7,6,1};
//        for(int ele : arr){   //ele naam ka dabba aya usme copy banti hai
//            System.out.println(ele);
//        }

//        int arr [] = {4,5,8,7,6,1};
//        for(int ele : arr){   //ele naam ka dabba aya usme copy banti hai
//            ele = ele*2;
//        }
//        for(int ele : arr){
//            System.out.print(ele+" ");   // output 4 5 8 7 6 1 ayega
//        }

        int arr [] = {4,5,8,7,6,1};
        for(int i =0;i<arr.length;i++){
            arr[i] *=2;
        }
        for(int ele : arr){
            System.out.print(ele+" ");   // output 8 10 16 14 12 2 ayega
        }

    }
}
