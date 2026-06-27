package Strings;

public class InterningAndNewKeyword {
    public static boolean equals(String s1, String s2) {
        if(s1.length() != s2.length()) return false;
        for(int i = 0; i<s1.length();i++) {
            if(s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    static void main(String[] args) {
//        String s = " Pappu ";
//        String t = " Pappu ";
//        // ye dono same string ko indicate kar rhe hai koi naya nhi bana
//         String a = new String("Pappu");
//         //isme ne string ban rha hai
//
//        String f = "Hello";
//        f = "Buffalo";
//        //pehle f pointer hello tha ab wo buffalo ho gya

        String s1 = new String("Buffalo");
        String s2 = new String("Buffalo");
        System.out.println(s1==s2); //False dega kyuki dono alag
                                    // alag jagah par store hai

        String s3 = "Buffalo";
        String s4 = "Buffalo";
        System.out.println(s3==s4); //True dega kyuki yaha par ek hi
                                    // container hai string ka
                                    //bas variable naam alag hai


        System.out.println(s1.equals(s2));  //True dega Character by character scan karta hai

    }
}
