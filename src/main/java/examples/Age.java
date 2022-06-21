package examples;

public class Age {
    public static void main(String[] args) {


        int age = 255;
        if (age > 0 && age < 18)
            System.out.println("nieletni");
        else if (age >= 18 && age < 65)
            System.out.println("pełnoletni");
        else if (age >= 65)
            System.out.println("senior");
        else
            System.out.println("incorrect age");
    }
}
