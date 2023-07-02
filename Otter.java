package Lesson1;
import java.util.Arrays;
public class Otter extends Animal {

    public Otter(String name, String owner, String species, Integer age, String color, String vaccinate,
            Integer legsCount) {
        super(name, owner, species, age, color, vaccinate, legsCount);
    }
    public void Fly() {
        System.out.println("Otter can't fly");
    }
}