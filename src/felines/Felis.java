package felines;

import java.util.Objects;

public class Felis extends Animal{

    private static int vaccinationCount;

    private String name;

    private int age;

    private int shelterNo;

    private int badgeNo;

    public Felis() {

    }
    {
        vaccinationCount++;
    }
    public void miauw() {

    }

    public void miauw(int times){
        times++;
    }

    public static int getNoOfVaccinatedCats() {
        return 0;
    }

    public static int getVaccinationCount() {
        return vaccinationCount;
    }

    public static void setVaccinationCount(int vaccinationCount) {
        Felis.vaccinationCount = vaccinationCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getShelterNo() {
        return shelterNo;
    }

    public void setShelterNo(int shelterNo) {
        this.shelterNo = shelterNo;
    }

    public int getBadgeNo() {
        return badgeNo;
    }

    public void setBadgeNo(int badgeNo) {
        this.badgeNo = badgeNo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(shelterNo, badgeNo);
    }

    public Felis(String name, int age, int shelterNo, int badgeNo) {
        this.name = name;
        this.age = age;
        this.shelterNo = shelterNo;
        this.badgeNo = badgeNo;


    }
    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if(!(o instanceof Felis)) return false;
        Felis felis = (Felis) o;
        return shelterNo == felis.shelterNo&&badgeNo==felis.badgeNo;
    }

}
