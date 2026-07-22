package A12_Recursion;

public class LookandSay {
        public String countAndSay(int n) {
            if(n==1) return "1";
            String s = countAndSay(n-1);
            int i = 0;
            int j =0;
            StringBuilder ans = new StringBuilder();
            while(j<s.length()){
                if(s.charAt(i)==s.charAt(j)) j++;
                else{
                    int freq=j-i;
                    ans.append(freq);
                    ans .append(s.charAt(i));
                    i=j;
                }
            }
            int freq=j-i;
            ans.append(freq);          //Java me + ka behavior
                                       //Java me agar + operator ke ek side String ho, to doosri value automatically String ban jaati hai.
            ans .append(s.charAt(i));
            String result = ans.toString();
            return result ;
        }
    public static void main(String[] args) {
            LookandSay s = new LookandSay();
            System.out.println(s.countAndSay(6));

    }
}
