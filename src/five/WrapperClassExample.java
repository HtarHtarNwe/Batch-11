package five;

public class WrapperClassExample {
    public static void main(String[] args) {
        int a =67;
        String message="Hello";

        Integer integer=a;
        System.out.println(integer.getClass().getName());

        String str= integer.toString();
        System.out.println(str.length());

        float floaat1=6.7f;
        String num= "45303i84844";


        Integer num2= Integer.parseInt(num);
        System.out.println(num2);

        int num3 =num2;
        System.out.println(num3);



        int num4=54;
        String want= String.valueOf(num4);
    }
}
//primitive data type => obj->autoboxing
//obj => p d t-> unboxing