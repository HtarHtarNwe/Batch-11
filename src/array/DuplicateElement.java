package array;

public class DuplicateElement {
    public static void main(String[] args) {
        int numbers[]={1,2,3,4,5,6,3,4,7,8,9,9};
        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                if(numbers[i]==numbers[j]) {
                    System.out.println(numbers[j]);
                }
            }
        }

     int a =50;
        byte b=(byte)a;
        System.out.println(a);
        System.out.println(b);
        System.out.println();

    }
}
