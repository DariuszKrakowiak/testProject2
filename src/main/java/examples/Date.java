package examples;

public class Date {

    private int day;
    private int month;
    private int year;

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void actualDate(){
        System.out.printf("Aktulna data to: %d.%d.%d \n", day,month,year);

    }
    public void newDate(int d, int m, int y){
        System.out.printf("Nowa data: %d.%d.%d \n",d,m,y);
        day=d;
        month=m;
        year=y;
    }

    public Date newDate2(int d, int m, int y){
        day=d;
        month=m;
        year=y;
        return this;
    }
}