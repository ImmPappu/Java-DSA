package A15_OOPS;

public class Polymorphism {
    public static class Dog {
        void speak() {
            System.out.println("Bark");
        }
    }

    public static class Cat {
        void speak() {
            System.out.println("Meow Meow");
        }
    }

    public static class Pikachu {
        void speak() {
            System.out.println("Pika Pika");
        }
    }

    public static class Humar {
        void speak() {
            System.out.println("Hello");
        }
    }

    public static void main(String[] args) {
    Dog Happy = new Dog();
    Cat Billota = new Cat();
    Pikachu p = new Pikachu();
    Humar Pappu = new Humar();

    Happy.speak();
    Billota.speak();
    Pappu.speak();
    p.speak();




    }
}
