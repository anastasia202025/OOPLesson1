package Lesson1;
import java.util.Arrays;
public class Cat extends Animal {

    public Cat(String name, String owner, String species, Integer age, String color, String vaccinate,
            Integer legsCount) {
        super(name, owner, species, age, color, vaccinate, legsCount);
    }
    @Override
    public void ToGo() {
        super.ToGo();
    }
    @Override
    public void Swim() {
        System.out.println("Cat can't swim");
    }
    @Override
    public void Fly() {
        System.out.println("Cat can't fly");
    }
}