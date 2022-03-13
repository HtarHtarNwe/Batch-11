package array;

public class ArrayCopy {
    public static void main(String[] args) {
        int numbers[]={1,2,3,9,8,7,5,4,3};
        System.out.println(numbers.getClass().getName());// arrar name checking

        int other[] = new int[6];
        System.arraycopy(numbers,3,other,2,4);

        for(int i=0; i< other.length;i++){
            System.out.println(other[i]);
        }
        System.out.println();



        //Clone

        int another[]=other.clone();
        for(int  i = 0; i< another.length; i++){
            System.out.print(another[i]+"\t");

        }

        //jagged array

        int numbers1[][]=new int [3][];

        numbers1[0]= new int[8];
        numbers1[1]= new int[5];
        numbers1[2]= new int[5];
        numbers1[3]= new int[5];

        int dNumbers[][]= {
                {1,2,3,4,5,2,34,34,4},
                {5,4,3,2,1},
                {10,20,30,40,50},
                {5,5,4,4,3}

        };







    }
}
