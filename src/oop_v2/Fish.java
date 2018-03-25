package oop_v2;

public class Fish extends Animal {
    public Fish(int age, String gender, int weightInLbs) {
        super(age, gender, weightInLbs);
    }

    @Override
    public void move() {
        System.out.println("Fish is swimming...");
    }

    public void swim() {
        System.out.println("Swimming...");
    }
}
