package five;


class Type{
    int num1=50;
    void sum(){
        System.out.println("Parent sum method is working");
    }
}

public class TypeCasting extends Type {
    int num1=70;
    @Override
    void sum(){
        System.out.println("Child method sum method is working");
    }

    public static void main(String[] args) {
        int a =5;
        double b=a;//widening casting
        int c=(int)b;// narrowing casting


        //Type type =new Type();//upcasting


        TypeCasting typeCasting=new TypeCasting();
        TypeCasting type =typeCasting;//widening casting //upcasting

        //TypeCasting typeCasting=new TypeCasting();
        //Type type=typeCasting;//Down Castinng

        type.sum();
        System.out.println(type.num1);

    }
}

/**
 * byte
 * short
 * int
 * long
 * float
 * double
 */