package Seminar.Seminar1;

public class Dog extends Animal {

    private String breed;
    @Override
    public void voice() {
        System.out.println("Hello im dog dog " + breed);
    }
    public Dog(String name, int age) {
        super(name, age);
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}

