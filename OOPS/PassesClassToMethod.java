package OOPS;

public class PassesClassToMethod {
   public static class Car {
        int seat;
        double length;
        String type;
        String name;
        int torque;

        void print() {
            System.out.print(seat+" "+length+" m  "+type+" "+name+" "+torque+" NM");
        }
    }
    public static void main(String[] args) {
        Car c = new Car();
        c.length = 5;
        c.type = "SUV";
        c.name = "Kia Sonet";
        c.torque = 189;
        c.seat = 5;

        change(c);

        System.out.println(c.seat);  // seat=6; pass by reference
        c.print();
    }
        public static void change(Car x){
            x.seat=6;

        }
}
