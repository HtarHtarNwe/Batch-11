package three.oop;

public class Main {
    public static void main(String[] args) {

        //Parent Class
        //1)base Class
        //2)Super Class

        //Child Class
        //1)Derived Class,2) Extended Class and 3)Sub Class


        //Class Sub-Class extends Super-Class{}
        //Student == Child Class


        Student student=new Student();
        student.name="Aung Aung";
        student.age=17;
        student.grade=5;
        student.rollNumber=11;
        student.canSayHi();


        //Person ==Parent Class
        Person Person = new Person();
        Person.name="Mg Mg";
        Person.age=18;
        Person.canSayHi();

        ObjectOne Object = new ObjectOne();
        Object.rollNumber=10;

        //Parent Class -> Child class .Child Class ,(2 child class can connect)







    }
}
