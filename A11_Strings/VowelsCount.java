package A11_Strings;

import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(" Enter your word: ");
        String Word = input.nextLine();
        int count = 0;

        for (int i = 0; i < Word.length(); i++) {
            if(Word.charAt(i)=='A' || Word.charAt(i)=='E' || Word.charAt(i)=='I'
                    || Word.charAt(i)=='O' || Word.charAt(i)=='U'|| Word.charAt(i)=='a'
            || Word.charAt(i)=='e' || Word.charAt(i)=='i'|| Word.charAt(i)=='o'
            || Word.charAt(i)=='u') {
                count++;

            }
        }
        System.out.println(count);


    }
}
