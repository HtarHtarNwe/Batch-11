package array;

public class GetData {
    public static void main(String[] args) {

        GetData getData= new GetData();
        getData.checkLeapYear(2024);



    }
    public static void sumTwoNumber(int One, int Two){
       int  result =(One + Two);
        System.out.println(result);
    }
    public void checkLeapYear(int year){
        if(year%4==0){
            System.out.println(year+"is leap year");
        }
        else{
            System.out.println(year+"isn't leap year");
        }
    }
}
