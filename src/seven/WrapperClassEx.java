package seven;
public class WrapperClassEx {
    public static void main(String[] args) {
        int a =7;
        Integer num=a;//auto boxing
        System.out.println(num.getClass().getName());

        int number[]= new int[5];
        System.out.println(number.getClass().getName());

        float b=6.7f;
        Float num2=b;

        float c=num2;//unboxing
        System.out.println(c);

        String str="Mingalarbar";

        String year="2018";
        if (year.length()==4) {
            int realyear =Integer.parseInt(year);
            System.out.println(realyear);

            int year1=2018;
            String year2=String.valueOf(year1);
            System.out.println(year2.length());

            //primitive data type 8 ku => object change lo ya tl
        }


    }
}
//primitive datatype=> object => auto boxing
//obj=> p d=> unboxing