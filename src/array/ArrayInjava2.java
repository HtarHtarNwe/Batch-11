package array;

public class ArrayInjava2 {
    public static void main(String[] args) {
        String names[]=new String[]{"Mg Mg","Aung Aung","Ko Ko","Lin Lin","Phyo Phyo",""};

       // for loop

        for (int i = 3; i < names.length; i++) {
            System.out.print(names[i]+"\t");
        }
        System.out.println();

        //for each loop
        for (String name : names) {
            System.out.println(name);


            for (int i = names.length - 1; i >= 0; i--) {
                System.out.print(names[i]+"\t");

            }

        }


    }
}
