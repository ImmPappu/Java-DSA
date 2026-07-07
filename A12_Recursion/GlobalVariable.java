package A12_Recursion;

public class GlobalVariable {
    static int x = 10;
    public static void main(String[] args) {
        fun();
        x=9;
        System.out.println(x);
        int x = 4;   // local Variable declaration and initialisation
        System.out.println(x);
        x =7;
        System.out.println(x);
    }
    public static void fun(){

        x=20;
    }
}
