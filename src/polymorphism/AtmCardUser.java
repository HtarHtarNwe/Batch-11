package polymorphism;

class PersonOne{
    int id;
    String name;
    PersonOne(){

    }

    public PersonOne(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class AtmCardUser extends PersonOne {
    double amount;

    public AtmCardUser(double amount,int id, String name) {
        super(1,"Mg Mg");
        this.amount = amount;
    }
    void show(){

        System.out.println(super.id);
        System.out.println(super.name);
        System.out.println(amount);
    }


    public static void main(String[] args) {
        AtmCardUser User1= new AtmCardUser(10000,1,"Mg Mg");
        User1.show();

        System.out.println();

        AtmCardUser User2= new AtmCardUser(20000,2,"Phyu Phyu");
        User2.show();
    }


}

