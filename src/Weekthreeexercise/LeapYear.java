package Weekthreeexercise;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {


        System.out.print("Enter a Year : ");

        Scanner obj=new Scanner(System.in);
        int year= obj.nextInt();

        if(year%4==0){
            System.out.println(year + "is leap year");
        }
        else{
            System.out.println(year + "isn't leap year");
        }
    }
}
