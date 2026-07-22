package MultiDImensionalArrays;

public class ForEachLoop {
    static void main(String[] args) {
        int [][] arr = {{6,5,8,6,9},{1,0,8,9,9},{7,8,6,9,4},{9,18,16,90,4}};

           for (int [] elem : arr) {
               for(int ele :elem){
                   System.out.print(ele+" ");
               }
               System.out.println();
           }

//        for (int i=0;i<arr.length;i++){
//            for(int ele : arr[i]){
//                System.out.print(ele+" ");
//            }
//            System.out.println();
//        }
    }
}
