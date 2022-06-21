package examples;

import java.util.Scanner;

public class Name {

    public static void main(String[] args) {

        // Napisz program, który pobiera imie od użytkownika, najpierw jednak wypisze na ekran słowa "Podaj swoje imie".
// Imię powinno zostać wydrukowane na ekran. Jeśli podane imię zgadza się z "John Wick", to na ekran program
// powinien wypisać "Widzę, że znów pracujesz John", w przeciwnym przyypadku program powinien wydrukować na ekran
// "Witaj, [xyz]", gdzie [xyz], powinno zostać zastąpione wartością podaną przez użytkownika.


        System.out.println("Podaj swoje imie");
        Scanner stringToCompare = new Scanner(System.in);
        String myName = stringToCompare.nextLine();
        String name = "John Wick";
        if (myName.equals(name))
            System.out.println("Widze, ze znow pracujesz John...");
        else
            System.out.println("Witaj" + " " + myName);
    }

}
