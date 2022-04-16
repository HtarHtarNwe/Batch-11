package six_string;

public class StringExtraMethodEx {
    public static void main(String[] args) {
        String str="Hello World";
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());



        String str1="  Hello World   ";
        System.out.println(str1.length());
        System.out.println(str1.trim().length());


      /*  System.out.println("Enter Your Email.");
        String email=new Scanner(System.in).nextLine();
        if (email.endsWith("@gmail.com")){

            System.out.println("Your email is "+ email);

        }else{
            System.out.println("Please enter your email with specified type");
        }*/


      /*  System.out.println("Enter Your Name.");
        String name=new Scanner(System.in).nextLine();
        if (name.startsWith("Mg")){

            System.out.println("Hello Mg"+ name);

        }else if(name.startsWith("Ma")){
            System.out.println("Hello Ma"+ name);
        }else{
            System.out.println("Please enter your name with specified format");
        }*/


        String name2= "Kyaw Kyaw Zin";
        System.out.println(name2.charAt(4));
        System.out.println(name2.indexOf("in"));



    }
}
