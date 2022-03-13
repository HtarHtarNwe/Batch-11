package lesson;

public class Operators {
    public static void main(String[] args) {
        /**
         * Uniary Operator
         * binary Operator
         * Ternary Operator
         */

        //Binary Operator

        //Precedence
        // * , / , % , + , - ,

        int a =45;
        int c =45/4;
        System.out.println(c);

        int b =45;
        int d =45%4;
        System.out.println(d);

        //Arithmetice Operator  => *, / ,%, +, -

        int num=45+40;
        System.out.println(num);

        int num2=50-20;
        System.out.println(num2);




        //Relational Operator or Comparison operator => <, > ,<= ,>=
        //instandof  => ==, !=

        //result is true and false.

        boolean result =4 > 5;
        System.out.println("Wring result is" +result);

        boolean result1 =4 <= 5;
        System.out.println("Correct result is" +result1);

        boolean result3 =4 == 5;
        System.out.println(result3);

        //Logical Operator
        // && ,||  (AND, OR)

        int e= 30;
        int f = 20;
        int g= 50;
        boolean result5=e>f && f<g;
        System.out.println(result5);

        int h= 30;
        int i = 20;
        int j= 50;
        boolean result6=h<=i && i<j;
        System.out.println(result6);

        int k= 30;
        int l =20;
        int m= 50;
        boolean result7=k<=l || l<m;
        System.out.println(result7);

        /**
         * Bitwise Operator
         * &  => bitwise AND
         * ^  => bitwise exclusive OR
         * | => bitwise inclusive OR
         *
         */

        //false & false =false
        //false & true  =false
        //true  & false =false
        //true  & true  = true
        boolean result8=10>5 & 5<2;
        System.out.println("bitwise And T&F is"+result8);

        boolean result9=10>5 & 5>2;
        System.out.println("bitwise And T&F is"+result9);



        //false ^ false =false
        //true  ^ false =true
        //false ^ true  =true
        //true ^ true  =false

        boolean result10 =10>5 ^ 5<2;
        System.out.println("bitwise exclusive T&F is"+result10);

        boolean result11 =10<5 ^ 5<2;
        System.out.println("bitwise exclusive F&F is"+result11);

        boolean result12 =10>5 ^ 5>2;
        System.out.println("bitwise exclusive is T&T"+result12);


        //bitwise inclusive OR (same with Logical OR)

        //false | false =false
        //true  | false =true
        //false | true  =true
        //true | true   = true

        boolean result13 =10<5 | 5<2;
        System.out.println("bitwise inclusive is F&F"+result13);

        /**
         * << left shift
         * >> right shift
         * >>> right shift zero fill
         *
         */

        /**
         * 0 0 0 0 = 0
         * 0 0 0 1 = 1
         * 0 0 1 0 = 2
         * 0 0 1 1 = 3
         * 0 1 0 0 = 4
         * 0 1 0 1 = 5
         * 0 1 1 0 = 6
         * 0 1 1 1 = 7
         * 1 0 0 0 = 8
         * 1 0 0 1 = 9
         * 1 0 1 0 = 10
         *
         */

        //20
        // 1 2 4 8 16
        // 4 3 2 1 0
        // 1 0 1 0 0 =20

        //Left shift
        //10<<2
        //101000
        //543210
        //10 * 2^2=> formula

        int num10= 10<<2;
        System.out.println(num10);

        //10<<3
        //1010000
        //6543210
        //10 * 2^3 => formula
        int num11= 10<<3;
        System.out.println(num11);

        //right shift
       // 10>>2
      // 0010 =2
        int num12 =10>>2;
        System.out.println(num12);

        //10 /2^2 =>formula


        //1010
        //0001=1
        //10/2^3 => formula
        int num13 =10>>3;
        System.out.println(num13);

        //Assignment Operator
        // =, +=, -=, /=, %=, &= ,|=,<<=, >>=, >>>

        int z= 45;
       //   z= z+30;
      //    z+ =30;   (Writing is same)


        /**
         * a++
         * a--  => post fix
         * ++a
         * --a  => pre fix
         *
         */

        int r =45;
        r++;
        System.out.println(r);

        int s =45;
        ++s ;
        System.out.println(s);



       // Ternary Operator

        int t =20;
        int y= 70;
        int q =(t<y)?t:y;
        System.out.println(q);

        //(condition)?true:false;











    }
}
