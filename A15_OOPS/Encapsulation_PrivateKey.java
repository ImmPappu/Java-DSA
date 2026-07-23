package A15_OOPS;
 class Students{
     String name;
     private int rno;   //private hai toh print nhi hoga
     double cgpa;

     void print(){  //getter
         System.out.println(name+" "+rno+" "+cgpa);
     }
     int getRno(){
         return rno;
     }
     void setRno(int x){
         rno = x;
     }

//     public void p(){
//         print();
//     }
 }

public class Encapsulation_PrivateKey{
    static void main(String[] args) {
        Students s1 = new Students();
        s1.print();
        s1.name = "Ayushi";
        s1.cgpa = 9.1;
        //s1.rno=34;   error due to private
        s1.setRno(34);   //getter and setter for private
        System.out.println(s1.getRno());



    }
}
