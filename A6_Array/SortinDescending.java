package A6_Array;

public class SortinDescending {
    static void main(String[] args) {
        int []arr = {45,9,5,5};
                for(int i = 0; i < arr.length - 1; i++) {

                    for(int j = 0; j < arr.length - i - 1; j++) {

                        if(arr[j] < arr[j + 1]) { //> for ascending

                            int temp = arr[j];
                            arr[j] = arr[j + 1];
                            arr[j + 1] = temp;
                        }
                    }
                }
                for(int element : arr){
                    System.out.print(element + " ");
                }
            }
}
