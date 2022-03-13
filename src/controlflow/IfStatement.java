package controlflow;

public class IfStatement {
    public static void main(String[] args) {


        int a = 10;
        if (a < 11) {
            System.out.println("Statement is true");
        }

        int b = 10;
        int c = 20;
        if (b < c) {
            System.out.println("Answer is true");
        } else {
            System.out.println("Answer is false");
        }

        int mark = 40;
        if (mark < 40) {
            System.out.println("fail");
        } else {
            System.out.println("Pass");
        }

        int mark1= 81;
        if(mark1<40){
            System.out.println("fail");
        }
        else if(mark1 >=80){
            System.out.println("D");
        }
        else {
            System.out.println("Pass");
        }

        int mark2 = 30;
       if (mark2 >= 40 && mark2 < 80) {
           System.out.println("Pass");
       }
       else if (mark2 >= 80) {
           System.out.println("D");
       }
       else {
           System.out.println("Fail");
        }







    }
}
