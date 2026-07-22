package OOPS;
  //Data hiding is Abstraction and Encapsulation is binding code into a piece
class Fraction {
    int num;
    int den;

    Fraction(int num, int den) {
        this.num = num;
        this.den = den;
        simplify();
    }
    void print() {System.out.println(num + "/" + den);}
    void add(Fraction f){
        this.num = this.num*f.den + den*f.num;
        this.den = this.den * f.den;
        simplify();
    }
    void multiply(Fraction f){
        this.num = this.num*f.num;
        this.den = this.den*f.den;
        simplify();
    }
    void divide(Fraction f){
        this.num = this.num*f.den;
        this.den = this.den*f.num;
        simplify();
    }
    void simplify(){
        boolean isNegative = (num*den < 0) ? true : false;
        num = Math.abs(num);
        den = Math.abs(den);
        int gcd = hcf(num,den);
        num = num/gcd;
        den = den/gcd;
        if(isNegative){ num = -num; }

    }
    int hcf(int a,int b){
        if(b==0)return a;
        return hcf(b,a%b);
    }
}

public class FractionClass {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(25,-5);
        Fraction f2 = new Fraction(5,25);
        f1.multiply(f2);
        f1.print();
        Fraction f3 = new Fraction(-25,-50);
        f3.simplify();
        f3.print();



    }
}
