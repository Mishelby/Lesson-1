package ObjectClass;

import java.util.HashMap;

public class Runner {
    public static <Map> void main(String[] args) {
        Car bmw = new Car("BMW");
        Car mercedes = new Car("BMW");
        BMW bmw2 = new BMW("A1");

        Car.carInfo();
        BMW.carInfo();

//        BMW.carInfo();
//
//        System.out.println(bmw);
//        System.out.println(mercedes.hashCode());
//
//        System.out.println(bmw.equals(bmw));
//
//        Class<? extends Car> aClass = a1.getClass();
//        Class<? extends Car> aClass2 = bmw.getClass();
//
//        System.out.println(aClass);
//        System.out.println(aClass2);
    }
}
