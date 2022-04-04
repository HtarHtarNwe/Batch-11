package Weekthreeexercise;


import java.util.Scanner;

public class ATMProject{
    int id;
    String name;
    double amount;

    public ATMProject(int id, String name, double amount) {
        this.id = id;
        this.name = name;
        this.amount = amount;
    }



    public static void main(String[] args) {
        ATMProject user1=new ATMProject(1,"Hla Hla", 20000);

        Scanner scanner=new Scanner(System.in);

        System.out.println("Choose a Number:\n"+
                "1 for account inquiry\n"+
                "2 for deposit\n"+
                "3 for withdraw\n");
        int number=new Scanner(System.in).nextInt();


        if(number==1){
            System.out.print("Enter Account Number:");
            int id=new Scanner(System.in).nextInt();
            System.out.println(user1.name);
        }else if(number==2){
            System.out.println("Enter deposit amount:");
            double deposit=new Scanner(System.in).nextDouble();
            System.out.println(user1.amount+deposit);

            }else if(number==3){
            System.out.println("Enter Withdraw Number:");
            double witdraw= new Scanner(System.in).nextDouble();
                if(user1.amount>witdraw){
                System.out.println(user1.amount-witdraw);
                }else {
                System.out.println("Your balance amount is lower than withdraw amount.");
            }
        }
        }


}





