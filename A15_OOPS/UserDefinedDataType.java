package A15_OOPS;

import java.util.Scanner;

public class UserDefinedDataType {
    public static class Student{   //user define datatype
        String name;
        int age;
        double cgpa;
        void print() {
            System.out.print(name+" "+age+" "+cgpa );
            System.out.println();  // for next line
        }
    }
   public static void main(String[] args) {         //Scanner = class ; s1,s2,s3 is object
        Scanner sc = new Scanner(System.in);

        Student s1 = new Student();//declaration
        s1.name = "Pappu";
        s1.age = 19;
        s1.cgpa = sc.nextDouble();

        Student s2 = new Student();
        s2.name = "Ayushi";
        s2.age = 18;
        s2.cgpa = 9.1;

       Student s3 = new Student();
       s3.name = "Kaalu";
       s3.age = 18;
       s3.cgpa = 6.8;

       // System.out.println(s1.name +" "+s1.age+" "+s1.cgpa);

       s1.print();
       s2.print();
       s3.print();

    }
}
