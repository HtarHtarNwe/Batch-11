package five;

interface WorkFromMom{
    void Homework();
}

public class OlderBrother implements WorkFromMom {

    @Override
    public void Homework() {
        System.out.println("for eat");
    }
    void doIt(){


    }

    public static void main(String[] args) {
        OlderBrother obj = new OlderBrother();
        obj.Homework();

        YoungerBrother object1=new YoungerBrother(new OlderBrother());
        object1.doIt();




    }

}
