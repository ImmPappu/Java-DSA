package A11_Strings;

import java.util.ArrayList;

public class Replace0With5 {
    public int convertFive(int n) {
            String s = Integer.toString(n);
            StringBuilder sb = new StringBuilder(s);
            for (int i = 0;i<s.length();i++){
                if(s.charAt(i)=='0') {
                    sb.setCharAt(i, '5');
                }
            }

            int ans = Integer.parseInt(sb.toString());
            return ans;
        }
    public static void main(String[] args) {
        Replace0With5 obj = new Replace0With5();
        int result = obj.convertFive(10005);
        System.out.println(result);


    }
}
