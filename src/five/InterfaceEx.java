package five;

//Multiple Inheritance

interface Callable{
    int a= 78;  //=>constant //final
    void sum(); //abstract method
    void sum1(); //abstract method
    void sum2(); //abstract method
    void sum3(); //abstract method
    void sum4(); //abstract method
}

interface B{
    void cal();
}

public class InterfaceEx implements Callable,B{

    @Override
    public void sum() {
        System.out.println("This is sum");
    }

    @Override
    public void sum1() {
        System.out.println(4+6);

    }

    @Override
    public void sum2() {

    }

    @Override
    public void sum3() {

    }

    @Override
    public void sum4() {

    }

    @Override
    public void cal() {

    }

    public static void main(String[] args) {
        new InterfaceEx().sum();
        new InterfaceEx().sum1();

    }


}

