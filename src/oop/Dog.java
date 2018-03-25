package oop;

public class Dog extends Animal
{
    private int eyes;
    private int legs;

    public Dog(String name, int size, int weight, int eyes, int legs) {
        super(name, size, weight);
        this.eyes = eyes;
        this.legs = legs;
    }
}
