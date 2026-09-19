class WaterBottle{
    private String brand;
    private int capacity;
    private String color;
    private int id;
    public WaterBottle(){
        brand="Bisleri";
        capacity=900;
        color="Blue";
        id=935685;
    }
    public WaterBottle(String b,int c,String col,int i){
        brand=b;
        capacity=c;
        color=col;
        id=i;
    }
    public void getBrand(){
        System.out.println(brand);
    }
    public void getCapacity(){
        System.out.println(capacity);
    }
    public void getColor(){
        System.out.println(color);
    }
    public void getId(){
        System.out.println(id);
    }
    public void setBrand(String b){
        brand=b;
    }
    public void setCapacity(int c){
        capacity=c;
    }
    public void setColor(String col){
        color=col;
    }
    public void setId(int i){
        id=i;
    }

}
public class bottle {
    public static void main(String[]args){
        WaterBottle bottle1=new WaterBottle("dharshu",500,"green",123456);
        bottle1.getBrand();
        bottle1.getCapacity();
        bottle1.getColor();
        bottle1.getId();
    }
    
}
