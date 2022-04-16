package exception_handling;

public class ExceptionHandling {
    public static void main(String[] args) {
        String name = null;

        try {
            System.out.println(name.length());
        }catch (NullPointerException e){

        //} catch ( ArithmeticException e){ //& Exception-> for null
            System.out.println(e);
        }finally {
            System.out.println("do it.");
        }

    }
}
//null pointer exception