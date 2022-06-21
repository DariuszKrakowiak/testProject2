package examples;

public class Array {


    //        for (int i = 0; i < yetAnotherArray.length; i++) {
//            System.out.print(yetAnotherArray[i] + " ");
//        }
//
//        System.out.println();
//        for (int el : yetAnotherArray) {
//            System.out.print(el + " ");
//        }
    public static void main(String[] args) {

        String[] list = new String[10];
        list[0] = "AA";
        list[1] = "BB";
        list[2] = "CC";
        list[3] = "DD";
        list[4] = "EE";
        list[5] = "FF";
        list[6] = "GG";
        list[7] = "HH";
        list[8] = "II";
        list[9]= "JJ";

        for(int i = 0; i < list.length; i++)
            System.out.println(list[i] + "");
        }


    }
