package felines;

public class CatAstrophischeApp {
    public static void main(String[] args) {

    NorwegianForestCat nfc1 = new NorwegianForestCat("Sasha", 3,12, 7);
    NorwegianForestCat nfc2 = new NorwegianForestCat("pacha",4,13,8);
    SiameseCat siam1 = new SiameseCat("siha",6,15,9);
    SiameseCat siam2 = new SiameseCat("siyush",2,16,10);
    SiameseCat siam3 = new SiameseCat("sesi",1,17,11);
    PersianCat persi1 = new PersianCat("tebriz",4,18,12);
    PersianCat persi2 = new PersianCat("Theran",3,19,13);
    TurkishVanCat van1 = new TurkishVanCat("safari",3,20,14);
    TurkishVanCat van2 = new TurkishVanCat("Tekir",2,21,15);
    AndeanMountainCat andean = new AndeanMountainCat();

    Felis [] myfelis = new Felis [5];
    myfelis [0] = new SiameseCat();
    myfelis [1] = new NorwegianForestCat();
    myfelis [2] = new PersianCat();
    myfelis [3] = new TurkishVanCat();
    myfelis [4] = new AndeanMountainCat();


        nfc1.miauwN();
        nfc2.miauwN();
        persi1.miauw();
        persi2.miauw();

        System.out.println("Number of vaccinated cats: " + Felis.getVaccinationCount());


        System.out.println("Are Norwegian Cats (nfc1&nfc2) equal to eachother? " + nfc1.equals(nfc2));

// Felis [] cats = new Felis[7];
// Felis [] cats2 = {new PersiansCat[7];


    }
}


/*


Bu stringlerin icine array metodu eklemelisin
Kediler subklas olacaklar

equals ve hashcode() kullanarak ayni barinak ve kimlik numarasindan olmadiklarini
goster



 */