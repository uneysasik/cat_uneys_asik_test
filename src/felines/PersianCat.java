package felines;

public class PersianCat extends Felis{

    public PersianCat() {

    }

    public void miauw(){
        System.out.println("This is how Persian Cats make noise: Miauw!!");
    }
    public PersianCat(String name, int age, int shelterNo, int badgeNo){
        super(name, age, shelterNo, badgeNo);
    }
    @Override
    public String toString() {
        return "PersianCat{}";
    }
}

