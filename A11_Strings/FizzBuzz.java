package A11_Strings;
import java.util.*;
public class FizzBuzz {
    public static void main(String[] args){
        FizzBuzz obj = new FizzBuzz();
        List<String> ans = obj.fizzBuzz(15);
        System.out.println(ans);
    }
    public  List<String> fizzBuzz(int n) {     // ye non static method hai isliye yaha hum class ka obj banay hai phir object ko initialise kiye hai
        List<String> ans = new ArrayList<>();
        for(int i= 1;i<=n;i++){
            if(i%15==0){
                ans.add("FizzBuzz");
            }
            else if (i%3==0){
                ans.add("Fizz");
            }
            else if (i%5==0){
                ans.add("Buzz");
            }
            else ans.add(String.valueOf(i));
        }
        return ans;
    }
}
