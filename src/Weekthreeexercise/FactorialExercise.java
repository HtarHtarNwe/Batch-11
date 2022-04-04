package Weekthreeexercise;

import jdk.jshell.SourceCodeAnalysis;

import java.util.Scanner;

public class FactorialExercise {

    static int factorial(int n){
        if(n==0)
            return 1;
        else
            return(n*factorial(n-1));

    }
    public static void main(String[] args) {
        System.out.print("Enter a FactNumber:");
        int fact=new Scanner(System.in).nextInt();

        System.out.print("Enter a Number:");
        int number=new Scanner(System.in).nextInt();

        fact= factorial(number);
        System.out.println(fact);

        System.out.println("Factorial of "+ number + "is"+ fact);


    }
}
