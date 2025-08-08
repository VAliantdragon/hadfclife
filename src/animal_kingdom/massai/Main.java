package animal_kingdom.massai;

import java.lang.Math;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {

//        System.out.println("--- Creating a animal_kingdom.massai.Bat ---");
//        Animal bat = new Bat();
//        bat.setName("Dracula");
//        bat.eat();
//        bat.makeNoise();
//        bat.roam();
//
//        System.out.println("\n--- Creating a animal_kingdom.massai.Cat ---");
//        Animal cat = new Cat("Whiskers");
//        cat.eat();
//        cat.makeNoise();
//        cat.roam();
//
//        System.out.println("\n--- Creating a animal_kingdom.Dog ---");
//        Dog dog = new Dog("Buddy");
//        dog.eat();
//        dog.makeNoise();
//        dog.roam();
//
//        System.out.println("\n--- Creating a animal_kingdom.massai.Snake ---");
//        Animal snake = new Snake("Slinky");
//        snake.eat();
//        snake.makeNoise();
//        snake.roam();
//
//
//        System.out.println("\n--- Creating a animal_kingdom.massai.Parrot ---");
//        Animal parrot = new Parrot("paplu");
//        parrot.eat();
//        parrot.makeNoise();
//        parrot.roam();
//
//        System.out.println("\n--- Creating a animal_kingdom.massai.Parrot ---");
////        Animal s = new Snake("billu badmosh");
//        Swimable s=new Snake("billu badmosh");
//        s.swiming();
//        Snake d=new Snake("asas");
//        d.sum(3,5,2,21,34);
//
//        Day day= Day.SUNDAY;
//
//        System.out.println("Everday be like "+day);
//        System.out.println("check order status");
//        Scanner sc=new Scanner(System.in);
//
//        int time=sc.nextInt();
//        if(time<9){
//            System.out.println(OrderStatus.ORDERED);
//        } else if (time>9 && time<12) {
//            System.out.println(OrderStatus.SHIPPED);
//        }
//        else{
//            System.out.println(OrderStatus.DELIVERED);
//        }
//
//        Order o=new Order(100,OrderStatus.ORDERED);
//        o.printStatus();

//        System.out.println("Enter your role : ");
//        Scanner sc = new Scanner(System.in);
//        String roleInput = sc.next().toUpperCase(); // Convert input to uppercase for comparison
//
//        try {
//            Role role = Role.valueOf(roleInput);
//
//            switch (role) {
//                case ADMIN:
//                    System.out.println("Welcome: " + role);
//                    break;
//                case USER:
//                    System.out.println("Welcome: " + role);
//                    break;
//                case GUEST:
//                    System.out.println("Welcome: " + role);
//                    break;
//                default:
//                    System.out.println("Unknown role.");
//                    break;
//            }
//        } catch (IllegalArgumentException e) {
//            System.out.println("Bhag jao yaha se");
//        }

//        Status s=Status.SUCCESS;
//        System.out.println("Status : "+s);
//        System.out.println("Code : "+s.getCode());
//
//        Order order=new Order(101,OrderStatus.SHIPPED);
//        order.printStatus();


//        Math m=new Math();
//        MathOperation op=new MathOperation() {
//            @Override
//            public int operate(int a, int b) {
//                return a+b;
//            }
//        };
//
//        Parrot namedParrot = new Parrot("Rocky");
//        namedParrot.flyable();
//        Flyable petAction = () -> namedParrot.flyable();
////        petAction.flyable();
//        MathOperation  add= Integer::sum;
//
//        SumKiClass s=new SumKiClass();
//        System.out.println(s.sum(3,4));
//        System.out.println(Integer.sum(3,1));
//
//        System.out.println(add.operate(3,8));
//        System.out.println(op.operate(3,5));
//        System.out.println(m.operate(2,3));
//
//        Consumer<String> printer= System.out::println;
//        printer.accept("jatta ka chora");
//
//        Predicate<Integer> truuuu=(s1 -> (s1%2==0));
//        System.out.println(truuuu.test(3));

//        Supplier<Double> getRandomGenerateedValue=()-> Math.random();
//        Supplier<Double> getRandomGenerateedValue=Math::random;
//        System.out.println(getRandomGenerateedValue.get());
//
//        List<String> names=List.of("ravi","dhruval","aryan","sunil","vamshi");
//        names.stream().filter(s->s.startsWith("r")).map(String::toUpperCase).sorted().toList();
//        System.out.println(names);
//
//        List <Integer> numbers= Arrays.asList(1,2,3,4,5,6);
//        List <Integer> even=numbers.stream().filter(n->(n%2==0)).toList();
//
//        System.out.println(even);

        List <employee> employee=Arrays.asList(new employee("dhruval","manager",344545),
                new employee("vamshi","employee",100000),
                new employee("aryan","peon",3435355),
                new employee("bhanu","manager",3434343));

        List <String> developer=employee.stream().filter(e->e.getRole().equals("manager")).map(e->e.getName()).collect(Collectors.toList());
        System.out.println(developer);

        List <fruits> words=Arrays.asList(new fruits("Apple"),
                new fruits("banana"),
                new fruits("tomato"),
                new fruits("watermelon"));

        List<String> fruits = words.stream()
                .filter(w -> w.getFruit().startsWith("b"))
                .map(w->w.getFruit())
                .collect(Collectors.toList());
        System.out.println(fruits);

        List <Integer> list=Arrays.asList(1,2,2,2,3,4,1,3);
        List <Integer> unique=list.stream().distinct().collect(Collectors.toList());
        System.out.println(unique);

        List <employee> sorted=  employee.stream().sorted(Comparator.comparing(e->e.getSalary())).toList();
        System.out.println(sorted);


    }
}

