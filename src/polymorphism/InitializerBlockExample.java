package polymorphism;

class Parent4{
    Parent4(){
        System.out.println("Parent Constructor is working.");
    }


}
class Parent5 extends Parent4{
    Parent5(){
        super();
        System.out.println("p5 default constructor.");
    }
    Parent5(int a){
        System.out.println("Parent 5 default constructor is working.");
    }
}
public class InitializerBlockExample {
    // instance data member /fields

    int a;

    InitializerBlockExample(){  //block
        //this.a =a;
        System.out.println("Value is "+a);
    }

    {
        a=56;
    }

    public static void main(String[] args) {
         new InitializerBlockExample();

         new Parent5();
         new Parent5(5);


    }
}
//Constructor and Instance Initializer block hmar Instance Initializer ka a yin a lote lote