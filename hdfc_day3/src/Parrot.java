class Parrot extends Bird{

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
}
