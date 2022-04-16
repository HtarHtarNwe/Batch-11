package polymorphism;

class A{
    A obj(){
        return this;
    }
}

class B extends A{
    B obj(){
        return this;// new B()
    }
}

public class CoVarient {
    public static void main(String[] args) {
        A obj =new A();
        System.out.println(obj.getClass().getName());


        B obj1= new B();
        System.out.println(obj1.getClass().getName());
    }

}
