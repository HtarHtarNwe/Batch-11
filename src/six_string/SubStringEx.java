package six_string;

import java.util.Arrays;

public class SubStringEx {

    public static void main(String[] args) {
        String message= "Hello,World";
        String result= message.substring(6);
        System.out.println(result);


        String result1=message.substring(0,5);
        System.out.println(result1);

        String result2=message.substring(6,9);
        System.out.println(result2);


        String sentences[]=message.split("\\,");
        System.out.println(Arrays.toString(sentences));
    }
}
