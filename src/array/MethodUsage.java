package array;

public class MethodUsage {


    /**
     * Method Declaring
     *
     *
     * public static void methodName(){ //Static method
     * }
     *
     * public void methodName(){//instance method  -> return ma pyan bu
     *  public int methodName(){} a sar htoe write lo ya
     * }
     * 1)public == access modifier
     * 2)static == static method
     * 3)void  == return type
     * 4)
     *
     *
     */

    // public int methodName(int num1, int num2){ }    //parameter hte lo ya

    /**access modifier
     * 1)public
     * 2)private
     * 3)protected ->same package/child  can use
     * 4)default    -> not include keywork (package same yin use lo ya)
     */
        //Method name ==verb and start with lower case
        //public void sumTwoNumber(){
        // }

    //Type of Methods
    //Predefine method
    //User define method
    public static void main(String[] args) {
        //Instance Method


    printHello();
    printHello();
    printHello();

    sumTowNum();
    twoNumber();

        //non static methodo
    MethodUsage object= new MethodUsage();
    object.sayMingalarPar();







    }//main method

    // User define method or Static Method
    public static void printHello(){
        System.out.println("Hello!");
    }

    public static void sumTowNum(){
        int a =10;
        int b= 20;
        int result =a+b;
        System.out.println(result);
    }

    public static void twoNumber(){
        int c=40;
        int d=30;
        int result1 =c -d;
        System.out.println(result1);

    }

    //non- static method (or) instance method
    public void sayMingalarPar(){
        System.out.println();

    }

    public static void sumTwoNumbers(int number1, int number2)
    {
        int result =(number1 + number2);
        System.out.println(result);
    }




    }


