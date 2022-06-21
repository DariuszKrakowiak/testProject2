package examples;

public class SetGetDate {

    public static void main(String[] args) {
        Date myNewDate = new Date();
        myNewDate.newDate(22,5,2022);
        myNewDate.actualDate();
        myNewDate.setYear(2020);
        myNewDate.setMonth(6);
        myNewDate.setDay(14);

        System.out.println("year: " +myNewDate.getYear());
        System.out.println("month: " +myNewDate.getMonth());
        System.out.println("day: " +myNewDate.getDay());

    }
}
