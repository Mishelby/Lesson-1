package Static;

public class MathUtils {
    public static final double PI = 3.14159;
    public static final int MINUTES_IN_HOUR = 60;
    private int counter = 0;

    public MathUtils() {
        counter++;
    }

    public int square(int a) {
        return a * a;
    }

    public  void printInfo() {
        System.out.println(getCounter());
    }

    public int getCounter() {
        return counter;
    }
}
