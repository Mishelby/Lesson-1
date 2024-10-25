package org.example;

import java.util.List;

public class Forest {
    private static List<MountainHare> hares;
    private static String season = "лето";

    public Forest(List<MountainHare> hares) {
        this.hares = hares;
    }

    public static void setSeason(String newSeason) {
        season = newSeason;
        for (MountainHare hare : hares) {
            if(season.equals("лето")){
                hare.setColor("серо-рыжий");
            }else{
                hare.setColor("белый");
            }
        }
    }

    public void printHares() {
        for (MountainHare hare : hares) {
            System.out.println(hare);
        }
    }

}
