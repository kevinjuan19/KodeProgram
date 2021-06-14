/**
 * @author Kevin Juan (1972002)
 */
public class Company extends Employee{
    protected Employee[] pegawai;

    public Company() {
        if(pegawai == null){
            pegawai =new Employee[0];
        }
    }
    public Employee[] getEmployee(){
        return pegawai;
    }
    public String getNextEmployeeId(){
        if(pegawai.length == 0){
            return "E-00000001";
        }
        else{
           return "E-000000" + Integer.toString(pegawai.length);
        }
    }
}
