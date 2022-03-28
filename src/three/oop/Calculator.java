package three.oop;

import java.util.Scanner;


public class Calculator {

    static void sum(int number1, int number2){
        System.out.println(number1+number2);
    }
    static void substract(int number1, int number2){
        System.out.println(number1-number2);
    }
    static void multiply(int number1, int number2){
        System.out.println(number1*number2);
    }
    static void divided(int number1, int number2){
        System.out.println(number1/number2);
    }
    public static void main(String[] args) {
     /* System.out.print("Enter  first number:");
        int number1= new Scanner(System.in).nextInt();
        System.out.print("Enter  second number:");
        int number2 =new Scanner(System.in).nextInt();
        System.out.print("Enter an Operator:\"+,-,*,/ \"");
        String Operator= new Scanner(System.in).nextLine();

          if(Operator.equals("+") ){
            System.out.println(number1+number2);
        } else if
            (Operator.equals("-")){
                System.out.println(number1-number2);
            }else if
        (Operator.equals("-")){
            System.out.println(number1*number2);
        }else if
        (Operator.equals("-")){
            System.out.println(number1*number2);
        }else{
        System.out.println("Your input operator is wrong");
        }
        */

         System.out.print("Enter  first number:");
        int number1= new Scanner(System.in).nextInt();
        System.out.print("Enter  second number:");
        int number2 =new Scanner(System.in).nextInt();
        System.out.print("Enter a number\n"+
        "1 for add\n"+
        "2 for substract\n"+
        "3 for multiply\n"+
        "4 for divided\n");

       int Operator= new Scanner(System.in).nextInt();

      /*   if(Operator==1){
            System.out.println(number1+number2);
        } else if
            (Operator==2){
                System.out.println(number1-number2);
            }else if
            (Operator==3){
            System.out.println(number1*number2);
        }else if
        (Operator==4){
            System.out.println(number1/number2);
        }else{
        System.out.println("Your input is wrong");
        }*/

        if(Operator==1){
            sum(number1,number2);
        } else if
        (Operator==2){
            substract(number1,number2);
        }else if
        (Operator==3){
            multiply(number1,number2);
        }else if
        (Operator==4){
            divided(number1,number2);
        }else{
            System.out.println("Your input is wrong");
        }




        }


    }

