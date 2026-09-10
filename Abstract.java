
abstract class Hospital {
    abstract void treatment();
    void hospitalName() {
        System.out.println("ABC Hospital");
    }
}
class Patient extends Hospital {
    void treatment() {
        System.out.println("Patient is receiving treatment");
    }
}
class Doctor extends Hospital { 
    void treatment() {
        System.out.println("Doctor is treating the patient");
    }
}
public class Abstract {
    public static void main(String[] args) {
        Patient p = new Patient();
        p.hospitalName();
        p.treatment();
        Doctor d = new Doctor();
        d.hospitalName();
        d.treatment();
    }
}

