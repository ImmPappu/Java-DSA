package A10_MultiDImensionalArray;

public class Gettingoutput {
    static void main(String[] args) {
        //int [][] arr = new int[3][4];
        int [][] arr = {{6,5,8,6,9},{1,0,8,9,9},{7,8,6,9,4}};

        System.out.println("Rows = "+arr.length+" "+"Columns = "+arr[0].length);

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }
    }
}
