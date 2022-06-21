package examples;

import java.util.Scanner;

public class Comparision {
    public static void main (String [] args){

        // Napisz program, który porówna dwa ciągi znaków wprowadzone przez użytkownika.
// Program powinien zwrócić wartość True jeśli obiekty są równe,
// w przeciwnym przypadku program powinien zwrócić false.

        System.out.println("Podaj pierwszy ciag znakow ");
        Scanner stringToCompare1 = new Scanner(System.in);
        String firstOne = stringToCompare1.nextLine();

        System.out.println("Podaj drugi ciag znakow ");
        Scanner stringToCompare2 = new Scanner(System.in);
        String secondOne = stringToCompare2.nextLine();
//stworz zmienna string na podobienstwo firstOne

        System.out.println("podajcie dwie zmienne firstOne i secondOne");
        boolean areEquals = firstOne.equals(secondOne);
        System.out.println(areEquals);

    }
}
