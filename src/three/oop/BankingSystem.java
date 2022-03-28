package three.oop;

import java.util.Scanner;

public class BankingSystem {
    int id;
    String name;
    double amount;

    public BankingSystem(int id, String name, double amount) {
        this.id = id;
        this.name = name;
        this.amount = amount;
    }
    void addAmount(double amt){
        //amount= amount+amt;
        amount+=amt;
    }
    void Withdraw(double a){
        if(amount>a){
            amount=amount-a;
            System.out.println(amount);
        }else{
            System.out.println("Your balance is lower than you need.");
        }

    }

    public static void main(String[] args) {

        BankingSystem user1= new BankingSystem(1,"Aung Aung",10000);
        System.out.println(user1.amount);

        user1.addAmount(40000);
        System.out.println(user1.amount);

        user1.Withdraw(60000);
        System.out.println(user1.amount);

        BankingSystem user2= new BankingSystem(2,"Khine Khine",30000);
        System.out.println(user2.amount);

        user2.addAmount(50000);
        System.out.println(user2.amount);

        user2.Withdraw(60000);
        System.out.println(user2.amount);
    }

}
