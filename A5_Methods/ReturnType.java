package A5_Methods;

public class ReturnType {
    public static int pappu(){
        System.out.println("pappu");
        System.out.println("Shinchan");
        return 14;
    }


    static void main(String[] args) {
        int x = pappu();
        System.out.println(3+x);  // pappu shinchan aur 17 print hua
        pappu(); // papppu aur shinchan print hua

    }
}
