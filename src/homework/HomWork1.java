package homework;

public class HomWork1 {
    public static void main(String[] args) {
        int number[]={2,4,5,6,7,8,9,10};


        for (int i = 0; i < number.length; i++) {

            if(number[i]%2==0){
                System.out.println("Even Number : "+number[i]);
            }else {
                System.out.println("Odd number :"+number[i]);
            }

        }

        System.out.println();




        int num1[]={1,2,3,4,5,6,3,4,7,8,9,9};
        int largest =0;
        for(int i=0;i<num1.length;i++) {

            if (num1[i]  >largest)
                largest = num1[i];
        }
        System.out.print("Largest number is :" + largest+"\t");



        int num2[]={1,2,3,4,5,6,3,4,7,8,9,9};
        int smallest =1;
        for(int i=0;i<num2.length;i++) {

            if (num2[i] == smallest)
                smallest = num2[i];
        }
        System.out.print("Smallest number is :" + smallest+"\t");
    }
}
