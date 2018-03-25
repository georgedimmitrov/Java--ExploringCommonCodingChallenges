package oop_v2;

public class Main {
    public static void main(String[] args) {
        Flyable flyingBird = new Sparrow(2, "F", 7);
//        Animal sparrow1 = new Sparrow(2, "F", 7);
//        sparrow1.move();

        Animal fish1 = new Fish(3, "M", 6);
//        fish1.move();

//        moveAnimal(fish1);
//        moveAnimal(sparrow1);
    }

    // polymorphism example
    public static void moveAnimal(Animal animal) {
        animal.move();
    }
}
