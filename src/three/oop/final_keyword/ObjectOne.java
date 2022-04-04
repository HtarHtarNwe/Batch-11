package three.oop.final_keyword;

public class ObjectOne { //public final  class ObjectOne => can't extands other class /variable and method


    public void sayMingalarPar(){
        System.out.println("Mingalar Par");
        System.out.println(AppFinalKeyWord.VALUE_OF_PI);
    }

    public void SayGoodBye(){
        System.out.println("Bye Bye!");
    }
}

class ObjectTwo extends ObjectOne{
    @Override
    public void sayMingalarPar() {
        System.out.println("Mingalar par form Class Member");
    }

    @Override
    public void SayGoodBye() {
        System.out.println("Good Bye!");
    }

    public static void main(String[] args) {

    }

}
//Syntax
//final class ClassName{}   => this class can't extands
//final variable variableName=10;   =>this value can't modify
//final return type MethodName(){}    => this method can't override
