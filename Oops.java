class Student{
    int rollno;
    String name;

    void show(){
        System.out.println(rollno);
        System.out.println(name);
    }

}
public class Oops{
    public static void main(String args[]){
        Student s1 = new Student();
        s1.rollno = 1234;
        s1.name = "Dharshu";
        s1.show();

    }
}