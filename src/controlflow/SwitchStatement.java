package controlflow;

public class SwitchStatement {
    public static void main(String[] args) {

        //Switch Statements

        int number =10;

        switch (number){
            case 1:
                System.out.println("Number is one");
                break;
            case 2:
                System.out.println("Number is two");
                break;

            case 3:
                System.out.println("Number is three");
                break;

            default:
                System.out.println("Number is not 1,2 and 3");
        }

        int results=(10*2);
        switch(results){
            case 20:
                System.out.println("Result is 20");
                break;

            case 30:
                System.out.println("Result is 30");
                break;

            default:
                System.out.println("Result is not equal 30 and 20");
        }
        System.out.println("Finished");

        String address ="Yangon";
        switch (address) {
            case "Yangon":
                System.out.println("Live in Yangon");
                break;
            case "Mandalay":
                System.out.println("Live in Mandalay");
                break;

            default:
                System.out.println("Not Live in Yangon and Mandalay");
        }


        String day= "monday";
        String str= " is weekday.";
        switch(day){
            case "monday":
                System.out.println(day + str);
                break;
            case "tueday":
                 System.out.println(day +str);
                 break;
            case "wednesday":
                 System.out.println(day + str);
                 break;
            case "thursday":
                System.out.println(day + str);
                break;
            case "friday":
                System.out.println(day + str);
                break;

            default:
                System.out.println("weekend.");

        }





    }
}
