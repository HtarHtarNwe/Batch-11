package three.oop.final_keyword;

class  parent6{
     void show(){//can't extend "final void show"
        System.out.println("Show Method");
    }

}

public class AppFinalKeyWord extends parent6{
    @Override
    void show() {
        super.show();
    }

    static final float VALUE_OF_PI=24.110f;

    private static  final int Hello=322;

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

        System.out.println(Hello);



    }





}
