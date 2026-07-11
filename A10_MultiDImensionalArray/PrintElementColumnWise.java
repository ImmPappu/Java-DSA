package A10_MultiDImensionalArray;

public class PrintElementColumnWise {
    static void main(String[] args) {
        int [][] arr = {{6,5,8,6,9},{1,0,8,9,9},{7,8,6,9,4},{9,18,16,90,4}};

        System.out.println("Rows = "+arr.length+" "+"Columns = "+arr[0].length);
        int idx = 0;
        for(int j=0;j<arr[0].length;j++){
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i][j] +" ");

            }
            System.out.println();
        }
    }
}
