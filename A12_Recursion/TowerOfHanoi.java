package A12_Recursion;

public class TowerOfHanoi {

    public static void main(String[] args) {
        hanoi(4,'A','B','C'); // src , helper , destination

    }

    public static void hanoi(int n, char a, char b, char c) {
        if(n==0) return;
        hanoi(n-1,a,c,b);           //n-1 disk for A to B via C
        System.out.println(a+"->"+c);  //largest disk from A to C
        hanoi(n-1,b,a,c);           //n-1 disk from B to C via A

    }
}
