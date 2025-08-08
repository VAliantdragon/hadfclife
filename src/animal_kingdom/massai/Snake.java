package animal_kingdom.massai;

import animal_kingdom.Animal;

public class Snake extends Animal implements Swimable{

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

    @Override
    public void swiming() {
        System.out.println("billu badmosh is swiming "+this.getName());
    }

    int sum=0 ;

    public void sum(int ... n){
        int i=0;
        for(int num:n){
            sum+=num;
        }
        System.out.println(sum);
    }
}