package homework;

public class HomeWork {
    public static void main(String[] args) {
        int number =50;
        switch (number){
            case 10:
                System.out.println("Number is 10");
                break;
            case 20:
                System.out.println("Number is 20");
                break;
            case 30:
                System.out.println("Number is 30");
                break;
            case 40:
                System.out.println("Number is 40");
                break;
            case 50:
                System.out.println("Number is 50");
                break;
            default:
                System.out.println("Number is not 10,20,30,40 and 50");
        }
        String address ="Yangon";
        switch (address){
            case "Yangon":
                System.out.println("I live in Yangon");
                break;
            case "Mandalay":
                System.out.println("I live in Mandalay");
                break;
            default:
                System.out.println("I don't live in Yangon and Mandalay");

        }

        int age =20;
        switch (age){
            case 10:
                System.out.println("Age is 10");
                break;
            case 20:
                System.out.println("Age is 20");
                break;
            default:
                System.out.println("Age is not 10 and 20");

        }

        String name ="Hla Hla";
        switch (name){
            case "Hla Hla":
                System.out.println("My name is Hla Hla");
                break;
            case "Aung Aung":
                System.out.println("My name is Aung Aung");
                break;
            default:
                System.out.println("I am not Hla Hla and Aung Aung");
        }

        int a =30;
        if(a>10){
            System.out.println("a is less than 10");
        }else{
            System.out.println("a is greater than 10");}


        int b= 50;
        if(b>50){
            System.out.println("Answer is upper 50");
        }
        else{
            System.out.println("Answer is lower 50");

        }

        int number1= 10;
        while (number1<20){
            System.out.println(number1);
            number1+=2;
        }

        int number2=1;
        while(number2<10){
            System.out.println(number2);
            number2++;
        }
        int number3=1;
        while(number3<10){
            System.out.println(number3);
            number3+=3;
        }


        int num=5;
        do{
            System.out.print(num+"\t");
            num++;
        }while(num <10);
        System.out.println();

        int num1=1;
        do{
            System.out.print(num1+"\t");
            num1+=4;
        }while(num1<10);

    }
}
