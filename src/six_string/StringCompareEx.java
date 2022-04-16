package six_string;

public class StringCompareEx {
    public static void main(String[] args) {
        String s1="Hello";
        String s2="Hello";
        System.out.println(s1.equals(s2));
        System.out.println(s1==s2);



        String s3="bbc";
        String s4="abc";
        System.out.println(s3.compareTo(s4));

        String s5="add";
        String s6="aaa";
        System.out.println(s5.compareTo(s6));

    }
}
