package five;

abstract class Abs{
    Abs(){}
    void add(){}
    static int calculate(){
        return 1;
    }
    abstract void sum();//abstract method
    abstract void sum(int a);//abstract method
        }

public class AbstractionEx extends Abs {
    @Override
    void sum() {
        System.out.println("abstraction");
    }

    @Override
    void sum(int a) {
        System.out.println("Value"+a);
    }

    public static void main(String[] args) {
        new AbstractionEx().sum();
        new AbstractionEx().sum(5);
    }
}
//Abstract & Interface
//abstract method
//abstract class