package OOPS;
class ComplexNumber{
    double  x;
    double  y;
    ComplexNumber(double x,double y){
        this.x=x;
        this.y=y;
    }
    ComplexNumber(){}
    void print(){
        if(y>=0) System.out.println(x+" + "+y+"i");
        else System.out.println(x+" - "+(-y)+"i");
    }


    void add(ComplexNumber z) {
        this.x +=z.x;
        this.y +=z.y;

    }

    void multiply(ComplexNumber z) {
        x = x*z.x -y*z.y;
        y = y*z.x + y*z.x;

    }
    void divide(ComplexNumber z) {
//        x = x/z.x;
//        y = y/z.y;

    }
}
public class ComplexNumberClass {
    public  static void main(String[] args) {
        ComplexNumber z1 = new ComplexNumber(3,4);
        ComplexNumber z2 = new ComplexNumber(3,-4);
        z1.print();  z2.print();

        // z1.add(z2);
        // z1.print(); //Give addition

        z1.multiply(z2);  //Give Multiplication
        z1.print();




    }
}
