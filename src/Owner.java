/**
 * @author Kevin Juan (1972002)
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Owner extends Person{
    protected Company perusahaan;

    public Owner(Company company){
        perusahaan = company;
    }

    public void addEmployee(Employee employee) throws ParseException {
        perusahaan.pegawai = Arrays.copyOf(perusahaan.pegawai, perusahaan.pegawai.length+1);
        Scanner sc = new Scanner(System.in);
        System.out.print("Employee first name: ");
        String fn = sc.next();
        employee.setFirstName(fn);
        System.out.print("Employee last name: ");
        String ln = sc.next();
        employee.setLastName(ln);
        System.out.print("Join date(yyyy-mm-dd): ");
        String date = sc.next();
        Date tglJoin = new SimpleDateFormat("yyyy-MM-dd").parse(date);
        employee.setJoinDate(tglJoin);
        employee.setId(perusahaan.getNextEmployeeId());
        perusahaan.pegawai[perusahaan.pegawai.length - 1] = new Employee(employee.getFirstName(), employee.getLastName(), employee.getId(), employee.getJoinDate());
    }
    public void viewAllEmployee(){
        Employee[] vEmployee = perusahaan.getEmployee();

        System.out.print("ID\t\t\t");
        System.out.print("NAME\t\t\t");
        System.out.print("JOIN DATE");
        System.out.println();

        for(int i = 0; i<vEmployee.length; i++){
            System.out.print(vEmployee[i].getId()+"\t");
            System.out.print(vEmployee[i].getFullName()+"\t");
            System.out.print(vEmployee[i].getJoinDate());
            System.out.println();
        }
    }
}
