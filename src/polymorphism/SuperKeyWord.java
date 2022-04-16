package polymorphism;

class SuperParent{
    String name= "Mg Mg";
}

public class SuperKeyWord extends SuperParent {
    String name ="Aung Aung";


    void show(){
        System.out.println(super.name); //parent ko call chin yin use.
    }
    public static void main(String[] args) {
        SuperKeyWord obj= new SuperKeyWord();

        System.out.println(obj.name);
        obj.show();
    }

}

