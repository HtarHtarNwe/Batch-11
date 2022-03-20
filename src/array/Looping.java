package array;

public class Looping {
    public static void main(String[] args) {
        //break, continue

        for (int i = 0; i < 10; i++) {

            if(i==5) {
                break;
            }
            System.out.println(i);
        }

        //continue

        for (int i = 0; i < 15; i++) {
            if(i==5) {
                continue;
            }
            System.out.println(i);

            for (int j = 0; j < 6; j++) {
                if(j==3){
                    break;
                }
                System.out.println(j);
            }


        }

    }
}



