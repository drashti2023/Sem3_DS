import java.util.Scanner;
class Student_Detail {
    int Enrollment_No;
    String Name;
    int Semester;
    float CPI;

    public Student_Detail(int Enrollment_No, String Name, int Semester, float CPI) {
        this.Enrollment_No = Enrollment_No;
        this.Name = Name;
        this.Semester = Semester;
        this.CPI = CPI;
    }
}
public class StudentRecord{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student_Detail[] students = new Student_Detail[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for Student " + (i + 1) + ":");
            System.out.print("Enrollment No: ");
            int enrollmentNo = sc.nextInt();
            sc.nextLine(); 
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Semester: ");
            int semester = sc.nextInt();
            System.out.print("CPI: ");
            float cpi = sc.nextFloat();

            students[i] = new Student_Detail(enrollmentNo, name, semester, cpi);
        }

        System.out.println("\nDetails of Students:");
        for (Student_Detail student : students) {
            System.out.println("Enrollment No: " + student.Enrollment_No);
            System.out.println("Name: " + student.Name);
            System.out.println("Semester: " + student.Semester);
            System.out.println("CPI: " + student.CPI + "\n");
        }
        sc.close();
    }
}
