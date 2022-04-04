package instance_initializer;

public class MyClass {
    public static void main(String[] args) {

        /*syntax of instance initializer=>variable pe value hte lo ya
        Cannot write method in
        {
            //code
        }
         */

        PowerBank bank=new PowerBank();
        PowerBank bank1=new PowerBank("s");
        PowerBank Bank2=new PowerBank(10);
        PowerBank Bank3=new PowerBank(1);

    }

}
