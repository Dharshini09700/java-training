class Cylinder{
    private int radius;
    private int height;

    public Cylinder(){
        radius = 1;
        height = 1;
    }
    public Cylinder(int r,int h){
        radius = r;
        height = h;
    }
    public Cylinder(int c){
        radius = height = c;
    }
    public void getRadius(){
        System.out.println(radius);
    }
    public void getHeight(){
        System.out.println(height);
    }
    public void setRadius(){
        Cylinder radius;
    }
    public void setHeight(){
        Cylinder height;
    }
    boolean isEqual(Cylinder c){
        if(c.height == c.radius){
            return true;
        }
        else{
            return false;
        }
    }
}
public class Cylinderclass {
    public static void main(String args[]){
        Cylinder c1 = new Cylinder(5,7);
        System.out.println(c1.isEqual(c1));
    }
}
