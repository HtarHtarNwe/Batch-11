package eight;

public class StringClassExOne {
    public static void main(String[] args) {
        //String is immutable

        String str="java";
       String str1=str.toUpperCase();
        System.out.println(str);
        System.out.println(str1);

        String name=" ";
        if(name.isEmpty()){
            System.out.println("Name is empty!");
        }

        String text="april";
        System.out.println(text.charAt(3));

        String newtext =text.concat(",may,june,july");
        System.out.println(newtext);

        if(name.endsWith("apple"));
        System.out.println("name end with e");

        if(name.startsWith("apple"));
        System.out.println("name start with a");

        System.out.println("trim Method in string");
        String email = " wiin@gmail.com ";//space teay ko delete  lote pay tl
        System.out.println(email.trim());

        String a="a";
        String b="b";

        int valueA='a';
        int valueB='b';
        System.out.println(valueA);
        System.out.println(valueB);

        System.out.println(a.compareTo(b));

        String smallA="a";
        String capitala ="A";
        /*if(smallA.compareToIgnoreCase(capitala)){
         System.out.println("Equal");
        }else{
         System.out.println("Not Equal");
        }*/

      // int result =smallA.compareToIgnoreCase(capitala);
      // System.out.println(result);

        String message ="This is message";
        if(message.contains("message")){
       System.out.println("Contain Message");
       }
        System.out.println(message.replace("a", "the"));
        System.out.println(message.replaceFirst("message", "the"));
        System.out.println(message.replaceAll("a", "the"));

        String [] fruits={"Apple","Orange","Coconut","Strawberry"};
        String fri= String.join(",","fruits");
        System.out.println(fri);

        //StringBuilder and StringBuffer  => pre define class

     System.out.println("StringBuilder");//mutable
        StringBuilder sb = new StringBuilder("java");
        sb.append("is a programming language.");
        System.out.println(sb);

     System.out.println();

        String str2="java";//inmutable
        str2.concat("is a programming language.");
        System.out.println(str2);

        sb.insert(2,"Hay!");
        System.out.println(sb);

        sb.insert(5,12);
        System.out.println(sb);


        sb.reverse();
        System.out.println(sb);

        sb.charAt(2);
        System.out.println(sb);




    }

}
