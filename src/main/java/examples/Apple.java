package examples;

public class Apple {

    private String color;
    private int size;
    public String getColor(){
        return color;
    }

    public void setColor(String col){
        color = col;
    }

    public void setSize(int si){
        size = si;
    }
    public int getSize(){
        return size;
    }

    public Apple(){
        color = "green";
        size = 0;
    }

    public Apple (int newSize, String newColor){
        color = newColor;
        size = newSize;
    }

    public String rot (int rotTime, String rotColor){
        while (rotTime>0){
            System.out.println("rotting...");
            --rotTime;
        }
        color = rotColor;
        return "The apple is rotten";

    }

    public String rot(){
        return "The apple is rotten";

    }
    public void showApple(){
        System.out.printf("Kolor jablka to: %s \n",this.getColor());
        System.out.printf("Rozmiar jablka to: %s \n",this.getSize());
    }
}

