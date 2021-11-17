package felines;

public class Acinonyx extends Animal{

    private double speed;

    public Acinonyx() {

    }

    public void run(double distance) {
        System.out.println(distance);
    }




    public void kiauuww(){
        System.out.println("kiauuww!");
    }

    @Override
    public String toString() {
        return "Acinonyx{" +
                "speed=" + speed +
                '}';
    }
}
