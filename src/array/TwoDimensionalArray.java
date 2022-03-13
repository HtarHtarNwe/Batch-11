package array;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        int numbers[][]=new int[4][5];//data type array size, data type array name
        int dNumbers[][]= {
                        {1,2,3,4,5},
                        {5,4,3,2,1},
                        {10,20,30,40,50},
                        {5,5,4,4,3}

        };
        System.out.println(dNumbers[2][4]);
        System.out.println(dNumbers[3][3]);
        dNumbers[3][1]=60;
        System.out.println(dNumbers[3][1]);// change value

        System.out.println(dNumbers.length); //Checking row
        System.out.println(dNumbers[0].length);//Checking column

        for (int row = 0; row< dNumbers.length; row++) {
            for( int column=0; column<dNumbers[row].length; column++){
                System.out.print(dNumbers[row][column]+"\t");
            }
            System.out.println();


        }

        //for each loop

        for(int[] number:dNumbers){
            for(int n:number){
                System.out.print(n+"\t");
            }
            System.out.println();

        }




    }
}
