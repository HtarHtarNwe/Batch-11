package four;

class Animals{
    String name;

    void eat() {
        System.out.println("Eating");
    }

}

class Dog extends Animals{
   // String name = "Aung Net";
    String color="white";
    int age = 3 ;

    void jump(){
            System.out.println("Jumping");
        }
    }


class Cat extends Animals{
   // String name = "Meow";
    double weight =5;


    void play(){
        System.out.println("Playing");
    }
}

public class InheritanceEx {
    public static void main(String[] args) {

        Dog dog =new Dog();
        System.out.println(dog.name);
        dog.eat();


        Cat cat =new Cat();
        System.out.println(cat.name);
        cat.eat();

    }

}
/**
 * Single inheritance
 * Multi level inheritance
 *
 *
 *
 *
 */