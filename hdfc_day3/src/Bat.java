public class Bat extends Animal{

    public Bat(){

    }
    public Bat(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("this is a extended form of eating "+getName());
    }

    @Override
    public void makeNoise() {
        System.out.println("this is a extended  version of makeNoise "+getName());
    }

    @Override
    public void roam() {
        System.out.println("this is a extended  version of roaming "+getName());

    }
}
