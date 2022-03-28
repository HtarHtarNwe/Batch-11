package three.oop;

import java.util.Scanner;

public class AboutMethod {

     void add(int a, int b){   //parameter
        System.out.println(a+b);
    }
    static void eat(){
        System.out.println("eat methid is working");
        System.out.println("This is first sentence");
        System.out.println("This is Second Sentence");
        System.out.println("eat methid is working");
    }

    void name(String FirstName,String lastName){
        System.out.println(FirstName+lastName);
    }

   public static void main(String[] args) {
       eat();

       System.out.println();// method ko khine te a chain

       AboutMethod method= new AboutMethod();
       method.add(20,50);//argument
       method.add(2,8);

       method.name("Than","Than");




       //Input by predefined method=> Scanner
       System.out.println("Enter Your name:");

       Scanner scanner= new Scanner(System.in);
       String name= scanner.nextLine();

       System.out.println(name);
       System.out.println("My name is"+ name);

       System.out.println("Enter Your age:");
       int age=scanner.nextInt();

      /* System.out.println("Enter a number:");
       int userInput=scanner.nextInt();

       if(userInput%2==0){
           System.out.println("Your number is even");
       }else {
           System.out.println("Your number is odd");
       }
*/

       System.out.println("Enter Password");
       String str=scanner.nextLine();

       System.out.println(str.length());
       if(str=="password"){
           System.out.println(str=="password");

           System.out.println("password");
       }else{
           System.out.println(str=="password");
           System.out.println(str);//space ma pr pe hte yan lo
       }


   }






    //Syntax

    //Create

    //returnType methodName(){} =>method sa call te a chain

    //void = return type


}

