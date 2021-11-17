package felines;

public class NorwegianForestCat extends Felis{

    public NorwegianForestCat(String name, int age, int shelterNo, int badgeNo) {
    super(name, age, shelterNo, badgeNo);
    }

    public NorwegianForestCat() {

    }

    public void miauwN() {
        System.out.println("This is how Norwegian cats make noise: Yiauw!!");}




    @Override
    public String toString() {
        return "NorwegianForestCat{}";
    }



}




