package A11_Strings;

public class ReverseEachWordInAString {
    public static void main(String[] args) {
        String s = "Bishal is a bad boy";
        s = s.toLowerCase();
        System.out.println(s);


        int wordLength = 0;
        int j = 0;
        StringBuilder ans = new StringBuilder();
        int i = 0;
        for (j = 0; j < s.length(); j++) {
            if (s.charAt(j) == ' ') {
                String sub =s.substring(i,j);
                String reverse = new StringBuilder(sub).reverse().toString();
                ans.append(reverse);
                ans.append(" ");
                i=j+1;
            }
        }
        String sub = s.substring(i);
        String reverse = new StringBuilder(sub).reverse().toString();
        ans.append(reverse);

        System.out.println(ans);


    }
}
