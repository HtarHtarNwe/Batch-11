package four;

class Animal{
    String name;

    void eat(){
        System.out.println("Eating");
    }

}

class cat extends Animal{

   double weight=5;


    void jump(){
        System.out.println("Jump");
    }

}

class dog extends Animal{

    String color="White";
    int age=3;
    void play(){
        System.out.println("Playing");
    }
}

public class Inheritance {
    public static void main(String[] args) {

        dog dog= new dog();
        System.out.println(dog.age);
        System.out.println(dog.color);
        dog.play();
        System.out.println(dog.name);
        dog.eat();

        System.out.println();

        cat cat= new cat();
        System.out.println(cat.weight);
        cat.jump();
        System.out.println(cat.name);
        cat.eat();


    }
}
