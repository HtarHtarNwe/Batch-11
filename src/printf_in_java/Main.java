package printf_in_java;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.print("Hi World!");
        System.out.println("Hello World!");

        int currentYear=2022;
        System.out.println("Current Year is "+currentYear);//concat
        System.out.printf("Current Year is %d .", currentYear);
        System.out.printf("%d Current Year is  .", currentYear);

        char A ='A';
        System.out.printf("A is English %c .",A);
        System.out.printf("A is English %c and Current Year is %d.",A,currentYear);

        String Mg="Mg Mg";
        System.out.printf("Mg Mg is Name %s",Mg );

        double number=43.3;
        System.out.printf("Number is double %f",number);



       // boolean == %b



    }

}
