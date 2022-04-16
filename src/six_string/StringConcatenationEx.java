package six_string;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class StringConcatenationEx {
    public static void main(String[] args) {
        String name = "Mg Mg";
        System.out.println("Hello" + name + " Mingalar par");


        String fName = "Lin Lin";
        String lName = " Tun";
        System.out.println(fName.concat(lName));


        StringBuilder str = new StringBuilder("Hello");
        StringBuilder str1 = new StringBuilder(" World");

        StringBuilder result = str.append(str1);
        System.out.println(result);

        String result2 = String.format("%s%s", fName, lName);
        System.out.println(result2);

        String result3 = String.join("-", fName, lName);
        System.out.println(result3);


        StringJoiner output = new StringJoiner("-");
        output.add("my");
        output.add("name");
        output.add("is");
        System.out.println(output);

        List<String> strings = Arrays.asList("one", "two", "three");
        String str4 = strings.stream().collect(Collectors.joining("-"));
        System.out.println(str4);
    }
}