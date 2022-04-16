package five;

class Custom{
    private int num;
    Custom (int num){
        this.num= num;
    }

    @Override
    public String toString() {
        return String.valueOf(num);
    }
}

public class CustomWrapperClassExample {
    public static void main(String[] args) {
        Custom obj = new Custom(7);

        System.out.println(obj);

        System.out.println(obj.getClass().getName());
        System.out.println(new Custom(8).getClass().getName());

    }


}
