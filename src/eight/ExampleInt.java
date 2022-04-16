package eight;

public class ExampleInt {
    public static void main(String[] args) {
        int i= 12;
        if(Integer.valueOf(i).equals(12)){
            System.out.println(i);

        }

        String g="12";
        if(Integer.parseInt(g)==(12)){
            System.out.println(g);

        }

        int q=10;
        if(String.valueOf(q).equals(10)){
            System.out.println();
        }
    }
}
