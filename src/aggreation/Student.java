package aggreation;

public class Student extends Person{
        int grade;

        Student(String name, int age, int grade){
                super(name, age);
                this.grade = grade;
        }

        void showinfo(){
                System.out.println("Name    :"+name);
                System.out.println("Address :"+age);
                System.out.println("grade   :"+grade);
        }
        }
