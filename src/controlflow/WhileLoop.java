package controlflow;

public class WhileLoop {
    public static void main(String[] args) {

        //while loop
        //1) while and 2) do while

        //while :pre-test loop

      int number1 =7;
        while(number1<10) {
           System.out.print(number1+"\t");
           number1 +=2;
        }

       int number2 =1;
        while(number2<10) {
           System.out.print(number2+"\t");
           number2++;
       }

        int a =5;
        while(a<10) {
            System.out.println(a);
            a++;
        }

        //do while loop

        do{
            System.out.print(a+"\t");
            a+=2;
        }while (a<20);

        int num=4;
        do{
            System.out.println(num);
            num++;
        }while(num>7);


    }
}
