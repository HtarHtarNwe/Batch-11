package array;

public class VariablesInJava {
    /**
     * Variables
     * Global variable, Local variable
     *
     * global variable
     * Static variable(Class variable)
     * non-static variable or instance variable(Object variable)
     *
     */
    static String name ="Mg Mg";//Static variable
    String massage = "Hello World!";// instance variable

    public static void main(String[] args) {
        System.out.println(VariablesInJava.name);//class name a yin call ya ml and can output Static variable

        VariablesInJava obj = new VariablesInJava();//Create Object and can output instance variable
        System.out.println(obj.massage);




    }
}
