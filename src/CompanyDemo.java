/**
 * @author Kevin Juan (1972002)
 */
import java.text.ParseException;
import java.util.Scanner;

public class CompanyDemo {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int pil;
        Company company = new Company();
        Employee employee = new Employee();
        Owner owner = new Owner(company);

        System.out.print("Owner first name: ");
        String fn = sc.next();
        owner.setFirstName(fn);
        System.out.print("Owner last name: ");
        String ln = sc.next();
        owner.setLastName(ln);
        System.out.println("Welcome, " + owner.getFullName());

        do{
            System.out.println("==============================");
            System.out.println("1. Add new employee");
            System.out.println("2. View all employee");
            System.out.println("3. Exit");
            System.out.print("Choice: ");
            pil = sc.nextInt();
            if(pil == 1){
                owner.addEmployee(employee);
            }
            else if (pil == 2){
                owner.viewAllEmployee();
            }
            else {
                System.out.println("Wrong Menu");
            }
        }while (pil != 3);
    }
}
