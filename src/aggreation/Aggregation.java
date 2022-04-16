package aggreation;

public class Aggregation {
    String name;
    int age;
    Location location;

    public Aggregation(String name, int age, Location position) {
        this.name = name;
        this.age = age;
        this.location =position;

    }

    void showData(){
        System.out.println("Name is"+name+"\t"+"Age is"+age+"\t"+"Loacation is"+location.city+"\t"+location.state+"\t"+location.country);
    }

    public static void main(String[] args) {
      Location location1 =  new Location("Yangon","Yangon","Myanmar");

      Aggregation aggregation=new Aggregation("Mg Mg",20, location1);

     aggregation.showData();
    }

    //same with inheritance






}
