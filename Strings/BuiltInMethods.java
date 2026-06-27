package Strings;

public class BuiltInMethods {
    static void main(String[] args) {
        String str = "PappusgsrghsgDIKJ";
        String s = "Pappu";
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.indexOf("g"));
        System.out.println(str.lastIndexOf("g"));
        System.out.println(str.contains("g"));
        System.out.println(s.concat(str));
        System.out.println(str.startsWith(s));
        System.out.println(s + str);;
        System.out.println(str.replaceAll("[^p]","q"));  //small p chhodkar sab replace
        System.out.println(str.replaceAll("p","q")); // jaha jaha small p hai usko q se replace kar dega
    }
}
