package A11_Strings;

public class PalindromeString {
    public static void main(String[] args) {
        String s = "malayalam";
        int i = 0;
        int j = s.length()-1;
        while (i<j){
            if(s.charAt(i)!=s.charAt(j)) {
                System.out.println("Not palindrome");
                return;
            }
            i++;
            j--;
        }
        System.out.println("Palindrome ");

    }
}
