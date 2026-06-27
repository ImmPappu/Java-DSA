package A11_Strings;

public class StrngBlder {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        System.out.println(sb.length()+" "+sb.capacity());
        sb.append("Pappu");
        System.out.println(sb.length()+" "+sb.capacity());
        System.out.println(sb);
        String t = sb.toString();
        System.out.println(t);
        sb.setCharAt(0,'p');
        System.out.println(sb);
        sb.append("gyufgyksgdbfukehgrfiuweyHUIGig");
        System.out.println(sb.length()+" "+sb.capacity());


    }
}
