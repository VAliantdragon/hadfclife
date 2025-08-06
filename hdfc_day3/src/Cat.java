public class Cat extends Animal {

    public Cat() {

    }

    public Cat(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " the cat is eating tuna.");
    }

    @Override
    public void makeNoise() {
        System.out.println(getName() + " the cat meows.");
    }

    @Override
    public void roam() {
        System.out.println(getName() + " the cat is wandering around the house.");
    }
}