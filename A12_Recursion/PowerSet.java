package A12_Recursion;

import java.util.ArrayList;
import java.util.List;

public class PowerSet {
    public static void main(String[] args) {
        String s = "abc";
        List<String>list = new ArrayList<>();
        subset("",s,0,list);
        System.out.print(list);

    }
    public static void subset(String ans, String s, int index, List<String>list){
        if(index == s.length()) {
            if(ans.length()!=0) list.add(ans);

            return;
        }
         char ch =  s.charAt(index);
         subset(ans+ch,s,index+1,list);            //take     (very Important)
         subset(ans,s,index+1,list);                   //skip
    }
    }

