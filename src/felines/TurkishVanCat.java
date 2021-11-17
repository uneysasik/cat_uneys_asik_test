package felines;

public class TurkishVanCat extends Felis {
        public String name;

        public TurkishVanCat(String name, int age, int shelterNo, int badgeNo){
                super(name, age, shelterNo, badgeNo);
        }

        public TurkishVanCat() {

        }

        public void TurkishVanCat(String name) {
                this.name = name;
        }

        @Override
        public String toString() {
                return "TurkishVanCat{" +
                        "name='" + name + '\'' +
                        '}';
        }
}
