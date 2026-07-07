package A12_Recursion;
import java.util.Scanner;

public class aRaisedToPowerb {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("Enter the base: ");
    int a= input.nextInt();
    System.out.println("Enter the power: ");
    int b = input.nextInt();
    System.out.println(pow(a,b));
}
static int pow(int a,int b) {
    if (b==0) return 1;
    return a * pow(a,b - 1);
}
}
