package adt;

public class Counter {
    private String name;
    private int value;

    public Counter(String name) {
        this.name = name;
    }

    public void increment() {
        this.value++;
    }

    public int getCurrentValue() {
        return value;
    }

    @Override
    public String toString() {
        return name + ": " + value;
    }
}
