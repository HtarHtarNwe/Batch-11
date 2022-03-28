package three.oop;

class call{
    public static void main(String[] args) {
        AccessModifier obj1=new AccessModifier();
        System.out.println(obj1.a);
        System.out.println(obj1.b);
        System.out.println(obj1.d);
        //System.out.println(obj1.c);private can't work different class or different package


    }


}

public class AccessModifier {
    public int a =55;
    protected int b= 70;//same with default
    private int c=44;
    int d= 90;
    final double PI=3.14;


    public static void main(String[] args) {
        AccessModifier obj=new AccessModifier();
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);
        System.out.println(obj.d);


    }
}
/**
 * Modifier
 * 1)Access Modifier=>public ,private ,protected, default
 * 2)Non Access Modifier=>final, abstract, static ,transient, synchronized, volatile
 *
 *
 * Java=>4 ku shi
 * class =>public ,default
 *         =>final, abstract
 *
 * fields
 * method
 * constructor=>non access use lo ma ya
 *
 */