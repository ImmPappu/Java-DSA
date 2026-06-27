package Strings;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s1 = "race";
        String s2 = "care";
        if (s1.length() != s2.length()) {
            System.out.println("Not Anagram");
            return;
        }
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // for(int i = 0 ; i<arr1.length;i++){
        //   if(arr[i]!=arr2[i]) {
        //  sout("Not")

        if (Arrays.equals(arr1, arr2)) {
            System.out.println("Anagram");
        }
            else System.out.println("Not Anagram");
        }
    }




