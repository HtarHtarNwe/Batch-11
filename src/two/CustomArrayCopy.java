package two;

public class CustomArrayCopy {
    public static void main(String[] args) {
        //initialize an array
        int number[] = {1,3,2,4,6,5,7,8};
        int copy[] = new int[number.length];//{0,0,0,0,,0,0,0,0}
        //before copy

        for (int i = 0; i < copy.length; i++) {
            System.out.print(copy[i]+"\t");

        }
        System.out.println();

        for (int i = 0; i < number.length; i++) {
            copy[i]= number[i];

        }
        //after copy
        for (int i = 0; i < copy.length; i++) {
            System.out.print(copy[i]+"\t");

        }
        System.out.println();

        int largestNumber= 0;
        for (int i = 0; i < number.length; i++) {
            if(number[i]>largestNumber)
                largestNumber= number[i];

        }
        System.out.println(largestNumber);

        System.out.println();

        int numbers[] = {6,3,2,4,1,5,8,7};
        int smallestNumbers = 1;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] <= smallestNumbers)
                smallestNumbers = numbers[i];


        }
        System.out.println(smallestNumbers);
    }
}
