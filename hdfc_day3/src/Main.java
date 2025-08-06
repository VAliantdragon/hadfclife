public class Main {
    public static void main(String[] args) {

        System.out.println("--- Creating a Bat ---");
        Animal bat = new Bat();
        bat.setName("Dracula");
        bat.eat();
        bat.makeNoise();
        bat.roam();

        System.out.println("\n--- Creating a Cat ---");
        Animal cat = new Cat("Whiskers");
        cat.eat();
        cat.makeNoise();
        cat.roam();

        System.out.println("\n--- Creating a Dog ---");
        Dog dog = new Dog("Buddy");
        dog.eat();
        dog.makeNoise();
        dog.roam();

        System.out.println("\n--- Creating a Snake ---");
        Animal snake = new Snake("Slinky");
        snake.eat();
        snake.makeNoise();
        snake.roam();

        System.out.println("\n--- Creating a Parrot ---");
        Animal parrot = new Parrot("paplu");
        parrot.eat();
        parrot.makeNoise();
        parrot.roam();

    }
}
