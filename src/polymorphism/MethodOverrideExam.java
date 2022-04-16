package polymorphism;

class Over{

    void sum(){
        System.out.println("Parent Class method.");
    }

    void show(){
        System.out.println("This is show method.");
    }


}

public class MethodOverrideExam extends Over {


    @Override
    void sum(){
        System.out.println("Child Class Method.");

    }


    void useParentMethod(){
        super.sum();
    }




    public static void main(String[] args) {
        MethodOverrideExam obj=new MethodOverrideExam();
        obj.sum();
        obj.show();
        obj.useParentMethod();
    }


}//@Override => annotation
