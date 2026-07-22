package OOPS;
class Pokemon{
    int power;
    String type;
    Pokemon(String type,int power){
        this.type=type;
        this.power=power;
    }

    Pokemon(){}
    void print(){  //getter
        System.out.println(this.power + " " + this.type);
    }
    class StrongPokemon extends Pokemon{
        int speed;
    }
    class LegendaryPokemon extends Pokemon{  //Child Class
        String ability;
    }
    class GodPokemon extends LegendaryPokemon{
        char tag;
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Pokemon pikachu = new Pokemon();



    }
}
