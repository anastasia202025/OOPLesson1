package Lesson1;
import java.util.Arrays;
public class Animal {
    private String name;
    private String owner;
    private String species;
    private Integer age;
    private String color;
    private String vaccinate;
    private Integer legsCount;

    public Animal(String name, String owner, String species, Integer age, String color, String vaccinate, Integer legsCount) {
        this.name = name;
        this.owner = owner;
        this.species = species;
        this.age = age;
        this.color = color;
        this.vaccinate = vaccinate;
        this.legsCount = legsCount;
    }
    public Animal(String species, String color, Integer legsCount){
        this(null, null, species, null, color, null, legsCount);
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return String.format("Name = %s, Owner = %s, Species = %, Age = %d, Color = %s, Vaccinate = %s , LegsCount = %d",
        name, owner,species,age,color,vaccinate,legsCount);
    }
    public void ToGo() {
        System.out.println(this.name + " going");
    }
    public void Fly() {
        System.out.println(this.name + " flying");
    }
    public void Swim() {
        System.out.println(this.name + " swimming");
    }
}