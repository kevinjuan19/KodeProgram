/**
 * @author Kevin Juan(1972002)
 */
public class Employee extends Person{
    protected String nik;

    public Employee() {
    }

    public Employee(String firstName, String lastName, String nik) {
        super(firstName, lastName);
        this.nik = nik;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String toString(){
        return String.format("%-10s%-10s", getNik(), getFullName());
    }

}
