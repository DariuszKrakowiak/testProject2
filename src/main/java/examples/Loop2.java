package examples;

import java.util.Scanner;

public class Loop2 {

    // Zmodyfikuj kod z poprzedniego zadania, w taki sposób
// aby użytkownik samodzielnie podawał ilość
// wyświetlonych komunikatów.


    public static void main (String[] args){

        System.out.println("Podaj ilosc wyswietlen");
        Scanner myScanner = new Scanner(System.in);
        int myInt = myScanner.nextInt();
        for ( int i=1; i <= myInt; ++i)
        System.out.println("To jest" + " " +i+ " komunikat w petli");
    }

}
