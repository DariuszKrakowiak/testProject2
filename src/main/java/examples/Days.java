package examples;

public class Days {

    public static void main(String[] args) {
        int day = 6;
        String day2 = "poniedzialek";
        switch (day) {
            case 0:
                System.out.println("?");
                break;
            case 6:
            case 7:
                System.out.println("weekend");
                break;
            case 5:
                System.out.println("piąteczek");
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("praca ;(");
        }
    }
}

