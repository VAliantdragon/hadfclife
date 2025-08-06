public class Snake extends Animal {

    public Snake() {

    }

    public Snake(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " the snake is eating a mouse.");
    }

    @Override
    public void makeNoise() {
        System.out.println(getName() + " the snake hisses.");
    }

    @Override
    public void roam() {
        System.out.println(getName() + " the snake is slithering on the ground.");
    }
}