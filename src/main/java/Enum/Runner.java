package Enum;

public class Runner {
    public static void main(String[] args) {
        Season currentSeason = Season.SUMMER;

        switch (currentSeason) {
            case SUMMER:
                System.out.println("It's a summer");
                break;
            case WINTER:
                System.out.println("It's a winter");
                break;
            default:
                System.out.println("Incorrect season");
                break;
        }
    }
}
