package A3_Loops;

public class EvenUpto100UsingContinue {
    static void main(String[] args) {
        for(int a = 1; a <= 100; a++){
            if(a%2!=0){
                continue;
            }
            System.out.println( a);
        }
    }
}
