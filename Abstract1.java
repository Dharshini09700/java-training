abstract class kfc{
    abstract void sales();
}
class Customer extends kfc{
    void sales(){
        System.out.println("customer buying chicken.");
    }
}
class Staff extends kfc{
    void sales(){
        System.out.println("staff selling chicken.");
    }
}
public class Abstract1 {
    public static void main(String args[]){
        Customer c = new Customer();
        c.sales();
        Staff s = new Staff();
        s.sales();
    }
    
}
