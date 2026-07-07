package A12_Recursion;

public class GreatestCommonDIvisior {
    public static void main(String[] args) {
        int a = 100;
        int b = 50;
        int hcf = 1;
        for (int i = 1; i <= Math.min(a,b); i++) {
                if(a%i==0&&b%i==0){
                    hcf = i;;
                }
        }
        System.out.println(hcf);
        System.out.println(gcd(a,b));
    }
    //Time complexity O(log(min(a,b)));
    public static int gcd(int a, int b) {  //yaha hum ye nhi mention kiye ki a ya b bada hai let a=41 b=21
        if(b==0) return a;               // kyuki agar (41,21) hota toh (21%41) output 21 hi hoga kyuki chota hai 21
        return gcd(b,a%b);              // next iteration mei (21,41) ho jyega
    }
}
