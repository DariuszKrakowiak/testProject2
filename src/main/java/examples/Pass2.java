package examples;

import java.util.Scanner;

public class Pass2 {
    public static void main(String[] args) {
        Scanner readPassword = new Scanner(System.in);
        String password;
        String goodPassword = "Jupiter";

        while (true) {
            System.out.println("Podaj haslo");
            password = readPassword.nextLine();
            if (password.equals(goodPassword)) {
                System.out.println("Haslo poprawne. Milego dnia!");
                break;
            } else {
                System.out.println(password);
                System.out.println("Haslo bledne, probuj dalej");

            }


        }
    }
}
