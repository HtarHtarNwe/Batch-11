package two;

public class AscendingAndDescendingOrder {
    public static void main(String[] args) {
        int numbers[]={3,5,9,7,6,2,4,4,8};
        int valueNow = 0;
        for (int i = 0; i < numbers.length; i++) {

            for (int j =i + 1; j < numbers.length; j++) {
                if(numbers[i]>numbers[j]){
                    valueNow=numbers[i];
                    numbers[i]=numbers[j];
                    numbers[j]=valueNow;

                }

            }

        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]+"\t");

        }


        System.out.println();
        System.out.println(numbers[numbers.length-1]);
        System.out.println(numbers[numbers.length-2]);


        int number1[]={3,5,9,7,6,2,4,4,8};
        int valueNow1 = 0;
        for (int i = 0; i < number1.length; i++) {

            for (int j =i + 1; j < number1.length; j++) {
                if(number1[i]< number1[j]){
                    valueNow1=number1[i];
                    number1[i]=number1[j];
                    number1[j]=valueNow1;

                }

            }

        }

        for (int i = 0; i < number1.length; i++) {
            System.out.print(number1[i]+"\t");

        }
        System.out.println();
        System.out.println(number1[number1.length-1]);
        System.out.println(number1[number1.length-2]);
    }
}
