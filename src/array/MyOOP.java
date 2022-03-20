package array;

public class MyOOP {

    // OOP = Object Oriented Programming Language
    /**
     * 1) Class
     * 2) Object ka class ye instand pyit tl
     * 3) Inheritance ==extands
     * 4) Polymorphism  ==Override
     * 5) Abstraction   ==implements,
     *                  abstract class ,interface create ya ml
     * 6) Encapsulation  == getter, setter
     */

    //Object -> State and Behaviour
    //State == variables->(Global Variable and Local Variable)
    //Behaviour == method

    //Class-> fields == variables (method outside ka    fields lo call)
    // ->Methods
    // ->Constructors
    // -> Blocks
    // -> Inner class
    // -> Object



    public static void main(String[] args) {

        //Syntax for creating object
        //ClassName objectName =new ClassName();

        Students Student=new Students();
        System.out.println(Student.name);


        int number =19;  // ";" ပါရင် Statement လို့ခေါ်
        int number1=29;
        int result =number+number1;//Statement1
        System.out.println(result);

        int number2 =22;
        int number3=10;
        int result1 =number2+number3;//Statement2
        System.out.println(result1);

        MethodUsage.printHello();
        MethodUsage.sumTowNum();








    }
}
