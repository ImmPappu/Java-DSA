package OOPS;

import java.util.Arrays;

public class marks {
    public static class StudentData {
        int rno;
        int[] marks;

        StudentData(int[] s) {
          //  marks = Arrays.copyOf(s, s.length); //deep copy
             marks = s; //shallow copy
        }

        StudentData(int s) {
            marks = new int[s];
        }
    }

    public static void main(String[] args) {
        int[] arr = {4,5,9,3,7};
        StudentData s1 = new StudentData(arr);
        s1.marks[0] =40;
        System.out.println(arr[0]);
        StudentData s2 = new StudentData(2);
        s2.marks[0] =41;
        s2.marks[1] =42;



    }
}
