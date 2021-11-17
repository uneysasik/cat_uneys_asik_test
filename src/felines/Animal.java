package felines;

public class Animal {

    protected static int count;

    private char size;
    private char coat;

    private String color() {
        return color();
    }
    private double weight;

    public String makeNoise() {
        return makeNoise();
    }

    public void eat() {
        System.out.println("Whiskas");
    }

    public void sleep() {
        System.out.println("Sweet dreams");
    }

    public boolean isAlive() {
        return true;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Animal.count = count;
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public char getCoat() {
        return coat;
    }

    public void setCoat(char coat) {
        this.coat = coat;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
