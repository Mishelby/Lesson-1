package org.example;

public class MountainHare {
    private int age;
    private double weight;
    private int jumpLength;
    private static String color = "серый";

    public MountainHare(int age, double weight, int jumpLength) {
        this.age = age;
        this.weight = weight;
        this.jumpLength = jumpLength;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "MountainHare{" +
                "age=" + age +
                ", weight=" + weight +
                ", jumpLength=" + jumpLength +
                ", color='" + color + '\'' +
                '}';
    }
}
