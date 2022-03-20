package two;

import jdk.dynalink.beans.StaticClass;

public class ObjectAndClass {
    //static
    //instance

    static int b =67;
    static String name= "Mg Mg";


    int a= 45;

    public static void main(String[] args) {
        //to create object
        //ClassName objName = new Constructor();

        ObjectAndClass Object1 =new ObjectAndClass();

        System.out.println(Object1.a);

        System.out.println(ObjectAndClass.name);
        System.out.println(name);


    }

}
