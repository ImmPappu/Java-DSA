package OOPS;

public class Constructor {
    public static class Car{
        int price;
        String name;
        Car(){   //default constructor

        }
        Car(int price , String name){  //Parametrized constructor
            this.price = price;    //Ager price = price likha hota to ide samjh nhi pata kiske bare mei kaha ja rha hai
            this.name= name;
        }
        Car( String s ,int x ){  //Parametrized constructor
            price = x;
            name = s;
        }
        void print(){
            System.out.println(price+" "+this.name);
        }
    }
    public static void main(String[] args) {
        Car c1 = new Car(1,"Ayushi");
        c1.print();
        Car c2 = new Car("Pappu",13);
        c2.print();

    }
}
