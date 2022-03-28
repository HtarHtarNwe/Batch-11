package three.oop;

 class Member{
     int memberid;
     String membername;

}



public class ObjectInitial {
    //Static
    static int b=40;


    //Instance
    int id =1;
    String name ="Kyae Kyaw";

    public static void main(String[] args) {


        ObjectInitial object=new ObjectInitial();
        System.out.println(object.id);//Object ne call yin instance pe paw tl
        System.out.println(object.id);

        System.out.println(object.name);

        ObjectInitial object2=new ObjectInitial();
        int id=2;
        String name="Mya Mya";
        System.out.println(object2.id);
        System.out.println(object2.name);


        System.out.println(ObjectInitial.b);//This is Static.


        //Annonymous Object(4.5)
        /**
         * New keyword
         * New Instance() method
         * Clone
         * Deserialization
         * Factory Method
         *
         */
        //Class Name Object=new con();




    }
}
