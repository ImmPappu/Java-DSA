package A4_PatternPrinting;
import java.util.Scanner;

public class AlphabetSquare4 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        char ch;
        for (int i=1;i<=rows;i++){
            if(i%2==0){
                ch =(char)(i+64);
            }else {
                ch=(char)(i+96);
            }
            for(int j=1;j<=cols;j++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
}
