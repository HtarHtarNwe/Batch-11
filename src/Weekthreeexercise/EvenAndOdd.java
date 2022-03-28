package Weekthreeexercise;

import java.util.Scanner;

public class EvenAndOdd {

    public static void main(String[] args) {
        System.out.print("Enter a Number :");

        Scanner obj=new Scanner(System.in);
        int enterNum=obj.nextInt();
       if(enterNum%2==0){
           System.out.println("This is even number");
       }else{
           System.out.println("This is odd number");
       }
    }
}
