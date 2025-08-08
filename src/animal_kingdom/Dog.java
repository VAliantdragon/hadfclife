package animal_kingdom;

public class Dog extends Animal {

    public Dog() {

    }

    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " the dog is eating kibble.");
    }

    @Override
    public void makeNoise() {
        System.out.println(getName() + " the dog barks loudly.");
    }

    @Override
    public void roam() {
        System.out.println(getName() + " the dog is running in the park.");
    }
}