package fr.esiea.ex4A.api;

public class AgifyAnwser {
    public int age;
    public int count;
    public String name;
    public String country_id;

    public AgifyAnwser(String name, String country_id, int age, int count){
        this.age = age;
        this.name = name;
        this.count = count;
        this.country_id = country_id;
    }
}
