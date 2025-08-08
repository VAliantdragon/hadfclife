package animal_kingdom.massai;

class Parrot extends Bird implements Flyable{

    public Parrot() {

    }

    public Parrot(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " the parrot is eating kibble.");
    }

    @Override
    public void makeNoise() {
        System.out.println(getName() + " the parrot barks loudly.");
    }

    @Override
    public void roam() {
        System.out.println(getName() + " the parrot is running in the park.");
    }

    @Override
    public void flyable() {
        System.out.println("panchi banu udti firu...... " + getName() + " is now flying.");
    }
}
