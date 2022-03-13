package array;

public class ArrayInJava {
    public static void main(String[] args) {


        int numbers[]={23,2334,657,345,88,90};//array initialize
        System.out.println(numbers[5]);
        System.out.println(numbers[2]);
        numbers[2]=78;
        System.out.println(numbers[2]);

        //String names[]=new String[7];//array delceration
        String names[]=new String[]{"Mg Mg","Aung Aung","Ko Ko","Lin Lin","Phyo Phyo",""};
       // System.out.println(names[5]);
        //System.out.println(names[4]);

        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i]+"\t");}


        String cars[]=new String[4];
        cars[0]="Suzuki";
        cars[2]="Toyota";
        cars[3]="Marcedes";
        System.out.println(cars[1]);

        System.out.println(names.length);//(array room checking)
        names[2]="page";//(value change)
        System.out.println(names[2]);


        System.out.println(cars.length);

        //System.out.println(names);

        //new String pyan pr yin object.

        //Collection Frame work

        //one dimensional array
        //two or multidimensional array
        //jagged array
    }

    }

