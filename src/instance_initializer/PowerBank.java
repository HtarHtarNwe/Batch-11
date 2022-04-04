package instance_initializer;

public class PowerBank {
    int power;

    {
        power = 200;
    }
    PowerBank() {
        System.out.println("Output from IBB1: "+power);
    }
    //Instance Initialization Block(IBB)

    PowerBank(String p){
        System.out.println("Output from IBB2: " + power);
    }

    PowerBank(int number){
        System.out.println("Output from IBB3: " + power);
    }

    PowerBank(double number){
        System.out.println("Output from IBB4: " + power);
    }


    /**
     *
     *
     *
     *
     */






}
