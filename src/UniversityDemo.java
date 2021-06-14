/**
 * @author Kevin Juan(1972002)
 */
import java.util.Scanner;

public class UniversityDemo {
    public static void main(String[] args) {
        University univ = new University();
        Scanner sc = new Scanner(System.in);
        System.out.print("HR Manager NIK : ");
        String nik = sc.next();
        System.out.print("HR Manager First Name : ");
        String firstName = sc.next();
        System.out.print("HR Manager Last Name : ");
        String lastName = sc.next();
        HRManager HRManager = new HRManager();
        HRManager.setFirstName(firstName);
        HRManager.setLastName(lastName);
        HRManager.setNik(nik);
        HRManager.addEmployee(HRManager,univ);
        int pil;
        do{
            System.out.println("====================");
            System.out.println("1. Add new employee");
            System.out.println("2. Add new lecturer");
            System.out.println("3. View all employee");
            System.out.println("4. View all lecturer");
            System.out.println("5. Exit");
            System.out.print("Choice : ");
            pil = sc.nextInt();
            if (pil == 1){
                System.out.print("NIK : ");
                nik = sc.next();
                System.out.print("First Name : ");
                firstName = sc.next();
                System.out.print("Last Name : ");
                lastName = sc.next();
                Employee employee = new Employee(firstName,lastName,nik);
                HRManager.addEmployee(employee, univ);
            }
            else if (pil == 2){
                System.out.print("NIK : ");
                nik = sc.next();
                System.out.print("NIDN : ");
                String nidn = sc.next();
                System.out.print("First Name : ");
                firstName = sc.next();
                System.out.print("Last Name : ");
                lastName = sc.next();
                Employee employee = new Lecturer(firstName,lastName,nik,nidn);
                HRManager.addEmployee(employee, univ);
            }
            else if (pil == 3){
                HRManager.viewAllEmployee(univ);
            }
            else if (pil == 4){
                HRManager.viewAllLecturer(univ);
            }
        }while(pil != 5);
    }
}