class Student {
    String name;
    int mark;
    int sin;
    String Name(){
        return name;
    }
    int Mark(){
        return mark;
    }
    int Sin(){
        return sin;
    }
    
}
public class Stumethod{
    public static void main(String args[]){
        String name = "Dharshu";
        int mark = 86;
        int sin = 45;

        Student a = new Student();
        System.out.println(name);
        System.out.println(mark);
        System.out.println(sin); 

    }
}
