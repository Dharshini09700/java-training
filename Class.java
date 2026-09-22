class Classtv{
    void tv(){
        System.out.println("Switchon the TV");
        
    }
}
class Home extends Classtv{
    void smartTv(){
        System.out.println("Switchon the TV with remote");
    }
}

public class Class{
    public static void main(String args[]){
        Home c1 = new Home();
        c1.smartTv();
    }
}