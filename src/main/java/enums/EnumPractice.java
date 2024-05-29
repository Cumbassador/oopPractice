package enums;

import java.util.Arrays;

public class EnumPractice {
    public static void main(String[] args) {
        System.out.println("Season.WINTER = " + Season.WINTER);
        System.out.println("Season.valueOf(\"WINTER\") = " + Season.valueOf("WINTER"));

        Season[] seasons = Season.values();

        for (Season season :seasons) System.out.println("seasons.toString() = " + season.toString());

        Season season = Season.FALL;

        switch (season){
            case FALL:
                System.out.println("У нас осень");
                break;
            case SPRING:
                System.out.println("У нас весна");
                break;
            default:
                System.out.println("У нас не весна и не осень");


        }

        System.out.println("Coffee.AMERICANO = " + Coffee.AMERICANO);
        System.out.println("Days.Saturday.toString() = " + Days.Saturday.toString());


    }
}
