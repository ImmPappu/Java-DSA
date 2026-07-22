package A6_Array;


import java.util.Scanner;

public class MaxOfAllElements {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

         int arr[] = new int[n];
         int max = Integer.MIN_VALUE;

         for(int i=0;i<n;i++){
             arr[i] = sc.nextInt();
         }

        for(int i=0;i<arr.length;i++){
          if(arr[i]>max)
              max=arr[i];
        }
        System.out.println("The maximum number is "+max);

      }
    }

