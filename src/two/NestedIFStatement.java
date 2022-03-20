package two;

public class NestedIFStatement {
    public static void main(String[] args) {
        int a =45;
        if(a>40){
            int b=10;
            if(b==1){
                System.out.println("b is equal to 1.");
            }else if(b==2){
                System.out.println("b is equal to 2.");
            }else{
                System.out.println("b is not equal to 1 and 2.");
            }
        }else{
            System.out.println("a is less than 40.");
        }



        int c=30;
        if (c>40) {
            int d=10;
            switch (d){
                case 1:
                    System.out.println("d is equal to 1.");
                    break;
                case 2:
                    System.out.println("d is equal to 2");
                    break;
                default:
                    System.out.println("d is not equal 1 and 2");

            }


        }else{
            System.out.println("c is less than 40.");
        }

        System.out.println(OOPLessons.number);


    }
}
//if(){if(){}else{}}
//else{}