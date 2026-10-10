class circle{
    float radius;
    
    float Radius(){
        return radius*radius;
    }
}
class rectangle{
    float length;
    float breadth;
    float area;

    float Len(){
        return area/breadth;
    }
    float Area(){
        return length*breadth; 
    }
}
class accdetails{
    int accno;
    String name;
    int bal;

    int Acct(){
        return accno;
    }
    int Bal(){
        return bal;
    }
    String Name(){
        return name;
    }
}

public class Methodoops {
    public static void main(String args[]){
        circle a = new circle();
        rectangle b = new rectangle();
        accdetails c = new accdetails();

        a.radius = 7;
        b.length = 5;
        b.breadth = 46;
        b.area = 6;
        c.accno = 12345;
        c.bal = 12000;
        c.name = "Dharshu";

        System.out.println(a.Radius());
        System.out.println(b.Len());
        System.out.println(b.Area());
        System.out.println(c.Acct());
        System.out.println(c.Bal());
        System.out.println(c.Name());


    }
}
