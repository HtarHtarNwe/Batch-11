package lesson;

public class DataType {
    public static void main(String[] args) {
        String name= "Mg Mg";
        int num = 25;

        /**Primitive Data Type
         * 1)Boolean type
         * 2)Numeric type
         */

        //Non Primitive Data Type

        //byte , short , int , long , float , double , boolean , char
        //byte => 1 byte => 8 bits ==> Default is zero.(-128~127)
        //short => 2 bytes => 16 bits ==> Default is zero.

        byte num1=-128;
        System.out.println(num1);

        byte num2=127;
        System.out.println(num2);

        short num3 =554;
        System.out.println(num3);

        long num4 =1332344344594565l;
        System.out.println(num4);

        float num5= 2823.120f;
        System.out.println(num5);

        double num6= 5043.234344;
        System.out.println(num6);

        double num7= 50.2343445555;
        System.out.println(num7);

        //boolean = store true or false value.
        boolean flag =true;
        boolean flag1= false;
        System.out.println(flag);
        System.out.println(flag1);

        boolean result =(10<20);
        System.out.println(result);

        boolean result1 =(10<5);
        System.out.println(result1);

        char ch= 'A';
        System.out.println(ch);

        char a= 65;//hex
        System.out.println(a);

        char b= 66;
        System.out.println(b);

        char ch1= 0101;//Oct
        System.out.println(ch1);








    }
}
