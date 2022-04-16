package abstraction;

abstract class Parent{
    abstract void sum(int a);
    //abstract void sum1(int a);
    void add(){}
    static void calculator(){}
}

class Child1{

}
class Child2{

}

class AbstractionEx extends Parent{

    @Override
    void sum(int a){

    }
    public static void main(String[] args) {

    }
}
/**
 *
 * Class --public class ClassName{
 *
 * }
 *
 * Abstract Class-- public abstract class ClassName{
 *
 * }
 *
 * abstract method (method without body)
 * void send Message(String phoneNumber);
 *
 * non-abstract method  (method with body)
 *void send Message(String phoneNumber){
 *     //body
 *}
 */