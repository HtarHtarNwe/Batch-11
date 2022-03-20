package array;

import java.util.Scanner;

public class MainScanner {
    public static void main(String[] args) {

       /* Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int num=scanner.nextInt();

        scanner.nextLine();

        System.out.println("Enter you name");
        String name= scanner.nextLine();

        System.out.println("Enter input:" +num);
        System.out.println("Hello!"+name);*/

        //shift + F6 = to change class name

        Scanner scanner =new Scanner(System.in);

        System.out.println("Enter Base:");
        int base = scanner.nextInt();

        System.out.println("Enter hight :");
        int high = scanner.nextInt();

        int result =(base * high)/2;
        System.out.println("Area of triangle is :"+ result);








    }
}
