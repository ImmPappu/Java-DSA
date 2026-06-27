package A11_Strings;

public class ComareTO {
    static void main(String[] args) {
        String a = "Malayalam";
        String b = "Halayalam";
        System.out.println(a+b); //Concatenation
        System.out.println(a.compareTo(b));   //ASCII value of a - b of the index where not match
    }
}
