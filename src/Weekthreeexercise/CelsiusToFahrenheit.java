package Weekthreeexercise;

import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        System.out.println("Celcious To Fahrenheit");
        System.out.print("Enter Celsius: ");

        Scanner scanner=new Scanner(System.in);
        int C=scanner.nextInt();

        double F=(C*9/5)+32;
        System.out.println("Fahrenheit Value is :"+F);



        System.out.println();

        System.out.println("Fahrenheit to Celcious");
        System.out.print("Enter Fahrenheit: ");

        Scanner obj=new Scanner(System.in);
        int Fahrenheit=obj.nextInt();

        double Celcious=(Fahrenheit-32)*5/9;
        System.out.println("Celcious Value is:"+Celcious);








    }
}
