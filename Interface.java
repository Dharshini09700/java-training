interface Member{
    void callBack();
}
class Store{
    Member m[] = new Member[100];
    int count = 0;
    void reg(Member NM){
        m[count++] = NM;
    }
    void inviteoff(){
        for(int i = 0;i<count;i++){
            m[i].callBack();
        }
    }
}
class Customer implements Member{
    String name;
    Customer(String n){
        this.name = n;
    }
    public void callBack(){
        System.out.println(name+" customer comming");
    }
}
public class Interface {
    public static void main(String args[]){
        Store s = new Store();
        Customer c1 = new Customer("Dharshu");
        Customer c2 = new Customer("kowsi");
        s.reg(c1);
        s.reg(c2);
        s.inviteoff();

    }
}
