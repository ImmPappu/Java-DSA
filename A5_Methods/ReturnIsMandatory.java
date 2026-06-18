package A5_Methods;

public class ReturnIsMandatory {
    static void main(String[] args) {
        System.out.println(Hailo(5));
    }
    public static int Hailo(int a) {
        if(a<5){
            return 1;
        }
        else{
            return 2;
        }

    }
}
