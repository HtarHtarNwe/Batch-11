package Weekthreeexercise;

import java.util.Scanner;

public class AreaofCircleAndSquaare {
    public static void main(String[] args) {
        System.out.println("Area of Circle");
        System.out.print("Enter a radious:");

        Scanner scanner=new Scanner(System.in);
        int r=scanner.nextInt();

        double area =3.14*r*r;
        System.out.println("Area of Circle :"+area);


        System.out.println();


        System.out.println("Area of Square");
        System.out.print("Enter a Square:");

        Scanner s=new Scanner(System.in);
        int q =s.nextInt();

        int area1=q*q;
        System.out.println("Area of Square :"+area1);

    }
}
