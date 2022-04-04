package three.oop.final_keyword;

public class AppFinalKeyWord {

    static final float VALUE_OF_PI=24.110f;

    /**
     * Final Keyword
     *
     * 1)class
     * 2)variable => can use final keyword
     * 3)Method
     * */

    public static void main(String[] args) {
        final int a=10;//can use "final " to fix value
        int b=20;


       // a+=10;
        b+=10;
        System.out.println(a);
        System.out.println(b);

        int numberTwo=20;
        System.out.println(VALUE_OF_PI);
        System.out.println(numberTwo);

    }





}
