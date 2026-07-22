package A5_Methods;

public class MethodOverloading {
    public static int sum(int a, int b){
        return a+b;
    }
    public static int sum(int a, int b, int c){
        return a+b+c;
    }
    static void main(String[] args) {
        System.out.println(sum(1,2,3));
        System.out.println(sum(8,3));

    }
}
