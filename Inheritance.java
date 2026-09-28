class rectangle{
    int length;
    int breadth;

    rectangle(){
        length = breadth = 1;
    }

    rectangle(int l,int b){
        length = l;
        breadth = b;
    }

    public int area(){
        return length*breadth;
    }
}
class cuboid extends rectangle{
    int height;

    public cuboid(){
        height = 1;
    }

    public cuboid(int h){
        height = h;
    }

    public int volume(){
        return area()*height;
    }

    public cuboid(int l,int b,int h){
        super(l,b);
        height = h;
    }

}
public class Inheritance{
    public static void main(String args[]){
        cuboid c = new cuboid(2,4,6);
        System.out.println(c.volume());
    }
}