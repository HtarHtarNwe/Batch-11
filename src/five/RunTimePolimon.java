package five;

class Parent7{
    void add(){
        System.out.println("Parent add Method.");
    }
}


public class RunTimePolimon extends Parent7 {

    @Override
    void add(){
        System.out.println("Child add Method");
    }

    static void sum(int a){
        System.out.println(a+a);
    }

    static void sum (double a){
        System.out.println(a+a);
    }

    static void sum (int a, int b){
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        sum(5);
        sum(4,4);
        sum(2.2);

        RunTimePolimon obj=new RunTimePolimon();
        obj.add();
    }
}
