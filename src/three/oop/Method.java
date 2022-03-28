package three.oop;

public class Method {
    int multiple(int num1,int num2){
        System.out.println("Multiple is:"+(num1+num2));
        return 0;
    }

    String msg(){
        System.out.println();
        return "Hello World!";
    }
    static void eat(){


       System.out.println("eat method is working.");

    }

    void add(int num1, int num2){//parameter

        System.out.println(num1+num2);
    }

    void sum(int num3, int num4){
        System.out.println(num3+num4);
    }

    void name(String FirstName, String LastName){
        System.out.println("First Name is "+FirstName);
        System.out.println("Last Name is "+LastName);
    }
    public static void main(String[] args) {

     eat();
     eat();

      Method method=new Method();
      method.add(100,20);//argument
        method.sum(30,20);
        method.name("Mg Mg","Oo");
       String str= method.msg();
        int result= method.multiple(4,5);

    }



}
//2 method
//Pre defined method
//User defined method


//access modifier {non access modifier { returntype {methodNane(parameter)=> method header
//{implementation}=>method body


//About Return type

//Static pr yin Object create pay yan ma lo
