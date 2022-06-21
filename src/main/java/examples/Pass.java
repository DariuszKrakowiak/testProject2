package examples;

import java.util.Scanner;

public class Pass {
    public static void main(String[] args) {

        //Napisz program, który pobiera hasło od użytkownika, najpierw jednak wypisze na ekran słowa "Poproszę hasło".
//Pobrane hasło powinno zostać wypisane na ekran. Jeśli hasło zgadza się z hasłem wzorcowym "secret", to na ekran
//powinien zostać wypisany tekst "Witaj w tajnym miejscu.", w przeciwnym przypadku zakończ działanie programu.

System.out.println("Poprosze haslo");
        Scanner stringToCompare = new Scanner(System.in);
        String firstOne = stringToCompare.nextLine();
        String pass = "secret";
        if (firstOne.equals(pass))
            System.out.println("Witaj w tajnym miejscu");
            else
                System.out.println("Goodbye!");







    }
}