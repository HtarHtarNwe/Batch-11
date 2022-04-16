package polymorphism;

public class PolymorphismEx {

    //Method Overloading or Type Promotion

    static void calculate(int number1, int number2){
        System.out.println(number1+number2);
    }

    static void calculate(int number){
        System.out.println(number+number);
    }

    static void calculate(int number, int number1, int number2){
        System.out.println(number+number1+number2);
    }

    static void calculate(double number){
        System.out.println(number+number+number);
    }

    static void calculate(float number1, float number2){
        System.out.println(number1+number2);
    }

    //Type Promotion
    static void calculate(int number1, double number2){
        System.out.println(number1+number2);
    }
                                                                //Type ambiguity
    static void calculate(double number1, int number2){
        System.out.println(number1+number2);
    }
    public static void main(String[] args) {
        calculate(4,5);
        calculate(8);
        calculate(4.0);
        calculate(5,6,10);
        calculate(2.1f,3.1f);
        calculate(4,5.1);
        calculate(5.1,4);








    }

}



//Method Overloading
//Method Overriding