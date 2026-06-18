package A6_Array;

// variables mei change by values hota hai
// arrays mei change by reference hota hai

public class PassingArrayToMethods {
    static void main(String[] args) {
        int x[] = {10,95,9,54};
        System.out.println(x[2]);
        change(x);
        System.out.println(x[2]);
    }
    static void change(int[] y) {
       y[2]=65;

    }
}
