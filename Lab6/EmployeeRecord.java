import java.util.*;
class Employee_Detail{
    int employee_id;
    String name;
    String designation;
    double salary;
 
}
public class EmployeeRecord{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        Employee_Detail emp = new Employee_Detail();

        System.out.println("Enter id:");
        emp.employee_id = sc.nextInt();
        System.out.println("Enter name:");
        emp.name = sc.next();
        System.out.println("Enter designation:");
        emp.designation = sc.next();
        System.out.println("Enter salary:");
        emp.salary = sc.nextDouble();

        System.out.println("Employee id: "+ emp.employee_id);
        System.out.println("Name: "+ emp.name);
        System.out.println("Designation: "+ emp.designation);
        System.out.println("Salary: "+ emp.salary);

        sc.close();

    }
}