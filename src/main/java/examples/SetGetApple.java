package examples;

public class SetGetApple {

    public static void main (String [] args){
        Apple myNewApple = new Apple();
        myNewApple.setColor("green");
        myNewApple.setSize(5);
        myNewApple.showApple();

        System.out.println(myNewApple.getColor());
        System.out.println(myNewApple.getSize());
        System.out.println("Wywolanie funkcji rot z parametrami:");
        System.out.println(myNewApple.rot(10,"black"));
        System.out.println("Wywolanie funkcji rot bez parametrow:");
        System.out.println(myNewApple.rot());
    }
}
