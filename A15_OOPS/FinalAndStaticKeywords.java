package A15_OOPS;

class Cricketer{
    static String country = "NZ";      //iska aalag block create hoga jisko sab koi use karenge
    int runs;                          // een teeno ka ek sath ek block mei banega har object ke liye alag
    String name;
    double avg;
    void print(){
        System.out.println(runs+" "+name+" "+avg);
    }
    static void greet(){
        System.out.println("Hello ");
    }
}

public class FinalAndStaticKeywords {
   public static void main(String[] args) {
       //Cricketer c1 = new Cricketer();
      //  c1.country = "NZ";   // agar final keyword use hota toh ye error deta
       //Cricketer c2 = new Cricketer();
       // c1.country = "India";
       // System.out.println(c2.country);
       Cricketer.greet();
       System.out.println(Cricketer.country);
   }
}
