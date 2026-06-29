package A11_Strings;

public class NonRepeatingCharacter {
        public int firstUniqChar(String s) {
            int [] arr = new int[26];
            for(int i =0;i<s.length();i++){
                char ch = s.charAt(i);
                int idx = ch-97;
                arr[idx]++;
            }
            for(int i = 0; i < s.length(); i++){
                char ch = s.charAt(i);
                if (arr[ch -'a']==1){
                    if(s.charAt(i)==ch){
                        return i;    // This will give the index of the first non-repeating character in string length;
                    }
                }
            }
            return -1 ;
        }
//        for( i = 0; i < s.length(); i++){
//        char ch = s.charAt(i);
//        if (arr[ch -'a']==1){
//            return ch;            //This will give that non-repeating char;
//        }
//    }
//       return '$';

    public static void main(String[] args) {

    }
}
