package A11_Strings;

public class MostFrequentCharacter {
    public static void main(String[] args) {
        String s = "character";
        int n = s.length();
        int [] freq = new int[26];
        for(int i =0;i<n;i++){       // jab i=0 hoga yani ch = 'c' phir idx c-a yani 99-97 integer
            char ch = s.charAt(i);   //milega aur phir freq[2] yani array ka index 2 jo pehle 0 store kiya tha
            int idx = ch-'a';        //ab uske increment hoga idx++ yani 0 se 1 hoga ab jab dobara c ayega phirse increment
            freq[idx]++;            //hoga aur badhte jayega
        }
        int maxFreq =0;
        char ans = s.charAt(0);
        for (int i =0;i<26;i++){
            if(freq[i]>maxFreq){
                maxFreq = freq[i];
                ans = (char)(i+97);
            }
        }
        System.out.println("maxFreq of character is : "+ans );
        System.out.println("No of times : "+maxFreq);
    }
}
