package A11_Strings;

public class SubStringOfString {
    static void main(String[] args) {
        String s = "PappuKumar";
        System.out.println(s);
       // s.charAt(0)=t;   not possible

        System.out.println(s.substring(3)); //from index 3 to last index
        System.out.println(s.substring(3,8)); // 3 se lekar 7 tak
        System.out.println(s.substring(1,s.length()-1));
    }
}
