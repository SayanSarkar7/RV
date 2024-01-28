
class Pen{
    String coler;
    String type;
    public void write(){
        System.out.println("writing with the pen.");
    }
    public void printColor(){
        System.out.println(this.coler);
    }

}

class Student{
    String name;
    int age;
    public void prontInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
//    Student(){
//        System.out.println("constructor called");
//    }
//    Student(String name, int age){
//        this.name=name;
//        this.age=age;
//    }
    //copy constructor
    Student(Student s){
        this.name=s.name;
        this.age=s.age;
    }
    Student(){

    }
}
public class ClassesObjects {
    public static void main(String args[]){
//        Pen pen1=new Pen();
//        pen1.coler="blue";
//        pen1.type="gel";
//        pen1.write();
//
//        Pen pen2=new Pen();
//        pen2.coler="black";
//        pen2.type="ballPoint";
//
//        pen1.printColor();
//        pen2.printColor();
//        Student s1=new Student();
//        s1.name="man";
//        s1.age=100;
//        s1.prontInfo();

//        Student s1=new Student("Man",100);
//        s1.prontInfo();
        Student s1=new Student();
        s1.name="man";
        s1.age=100;
        Student s2=new Student(s1);
        s2.prontInfo();
    }
}
