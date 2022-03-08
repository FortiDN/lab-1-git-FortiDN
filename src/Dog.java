package src;

public class Dog {
    String name;
    String breed;
    double height;
    double weight;

    public Dog(String name, String breed, double height, double weight) {
        this.name = name;
        this.breed = breed;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Hi, my name is " + name + "! " +
                "I'm a " + height + " cm tall " + breed +
                " that weighs " + weight + "kg.";
    }
}
