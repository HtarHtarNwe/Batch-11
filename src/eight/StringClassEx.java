package eight;

public class StringClassEx {
    public static void main(String[] args) {
        char chAr[]= {'H','e','l', 'l','o'};
        //String is a sequence of character.
        String hello =chAr.toString();
        String he = new String(chAr);
        System.out.println(he);

        char []message = {'U','n','i', 'v','e','r','s','i','t','y'};
        String str= new String(message);
        System.out.println(str);
        System.out.println(str.length());

        String msg="This_is_string";
        System.out.println(msg.length());

        String str2=" this is a cup";
        System.out.println(str2);

        String str3= str2.toUpperCase();
        System.out.println(str3);

        String str4=str3.toLowerCase();
        System.out.println(str4);


        String str5="java";
        String str6=new String("java");
        String str7="java";

        System.out.println();
        System.out.println("By using == operator");
        if(str5==str6){
            System.out.printf("%s is equal to %s",str5, str6);
        }else{
            System.out.printf("%s is not equal to %s",str5, str6);

        }

        if(str5==str7){
            System.out.printf("%s is equal to %s",str5, str7);
        }else{
            System.out.printf("%s is not equal to %s",str5, str7);

        }

        System.out.println();
        System.out.println("By using equals ");//to check equals operator
        if(str5.equals(str6)){
            System.out.printf("%s is equal to %s",str5, str6);
        }else{
            System.out.printf("%s is not equal to %s",str5, str6);

        }


    }
}


/**
 *
 * String
 * 1) String literal     String name="Mg Mg";
 * 2) new Keyword         String name= new String("Mg Mg");
 *
 *String constant pool
 */