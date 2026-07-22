package A11_Strings;

public class ReverseWord {
    public static void main(String[] args) {        //USing Window SLiding met
        String str = "the sky is blue";
        str = str.toLowerCase();
        System.out.println(str);
        str = str.trim().replaceAll("\\s+", " ");

        StringBuilder ans = new StringBuilder();
        int wordLength = 0;
        int i = str.length() - 1;
        int j = str.length() - 1;

        for (j =str.length()-1; j >= 0; j--) {
            if (str.charAt(j) == ' ') {
                String sub =str.substring(j+1,i+1);  // 12 pr space hai toh 13 se word start hoga aur last index -1 tak chlata hai isliye i+1 tak
                ans.append(sub);
                ans.append(" ");
                i=j-1;
            }
        }
        String sub = str.substring(0,i+1);  // loop j = -1 pr khtm hoga tab i =2 hoga space milne ke baad i = j-1 hoga tog 3-1 =2
        ans.append(sub);    // toh 0 se 2 tak first word hai isliye 0 se 3 tak ka substring kyuki end exclusive hota hai

        System.out.println(ans);

    }
}
