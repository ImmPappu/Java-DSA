package A11_Strings;

public class ReverseSb {
    public static void main(String[] args) {
        String s = "Pappu";
        StringBuilder sb = new StringBuilder(s);
//        sb.reverse();
//        System.out.println(sb);
        sb.deleteCharAt(0);
        System.out.println(sb);
        sb.insert(0,'P');
        System.out.println(sb);
        sb.delete(1,6);  // 1 to 5
        System.out.println(sb);
    }
}
