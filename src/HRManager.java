/**
 * @author Kevin Juan(1972002)
 */
import java.util.List;
import java.util.ArrayList;

public class HRManager extends Employee{
    public void addEmployee(Employee employee, University university){
        university.getEmployees().add(employee);
    }

    public void viewAllEmployee(University university){
        System.out.printf("%-10s%-10s","NIK","NAME");
        System.out.println();
        if (university.getEmployees().isEmpty()){
            System.out.println("No Data");
        }else{
            university.getEmployees().forEach(Employee ->{
                if (Employee instanceof Lecturer){
                    System.out.println(((Lecturer)Employee).toString());
                }
                else if (Employee instanceof Employee){
                    System.out.println(((Employee)Employee).toString());
                }
            });
        }
    }

    public void viewAllLecturer(University university){
        university.getEmployees().forEach(Employee -> {
            if (Employee instanceof Lecturer){
                System.out.println(((Lecturer)Employee).toString());
            }
            else {
                System.out.println("No Data");
            }
        });
    }
}
