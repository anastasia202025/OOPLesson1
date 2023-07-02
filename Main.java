package Lesson1;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Jack", "Rose", "Mammal", 4, "Gray", 
            "True", 4);
        Animal animal2 = new Animal("Bird", "Black", 2);
        animal1.ToGo();
        Cat barsik = new Cat("Barsic", "Peter", "Mammal", 10, "Orange", 
            "False", 4);
        Duck donald = new Duck("Donald", "Tony", "Bird", 3, "Brown", 
            "False", 2);
        Otter masya = new Otter("Masya", "Olga", "Mammal", 5, "Brown", 
            "True", 4);
        masya.Fly();
    }
}