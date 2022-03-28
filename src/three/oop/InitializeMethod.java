package three.oop;

public class InitializeMethod {
    int id;
    String name;

    void insert(int i, String n){
        this.id=i;
        this.name=n;

    }
    public static void main(String[] args) {
        InitializeMethod obj= new InitializeMethod();
        obj.insert(5,"David");


        System.out.println(obj.id);
        System.out.println(obj.name);//method use p object ko value hte


        //Initialize Method ye Constructor ko value pay
        Constructor con= new Constructor(2,"ThitSar");
        System.out.println(con.id);
        System.out.println(con.name);




    }
}
