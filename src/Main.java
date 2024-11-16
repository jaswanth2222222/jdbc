import course.Course;
import course.CourseDaoImpl;
import department.Department;
import department.DepartmentDaoImpl;
import relationship.Relationship;
import relationship.RelationshipDaoImpl;
import student.Student;
import student.StudentDaoImpl;

import java.util.Scanner;

public class Main {

    static Student student = new Student();
    static Department department = new Department();
    static Course course = new Course();
    static Relationship relationship = new Relationship();

    public static void main(String[] args) {

        StudentDaoImpl studentDaoImpl = new StudentDaoImpl();
        DepartmentDaoImpl departmentDaoImpl = new DepartmentDaoImpl();
        CourseDaoImpl courseDaoImpl = new CourseDaoImpl();
        RelationshipDaoImpl relationshipDaoImpl = new RelationshipDaoImpl();

        Scanner scanner = new Scanner(System.in);
        while(true) {

            System.out.println("Do you want to enter Student Details yes ---y or no ---n");
            System.out.print("Enter a value : ");
            String opinion = scanner.next();
            opinion = opinion.toLowerCase();

            switch (opinion) {

                case "y":
                    System.out.println("Enter Student Details : ");
                    System.out.print("Enter Student id : ");
                    scanner.nextLine();
                    student.setStudent_id(scanner.nextLine());
                    System.out.print("Enter Student Name : ");
                    student.setStudent_name(scanner.nextLine());
                    System.out.print("Enter Student Department : ");
                    student.setStudent_department(scanner.nextLine());
                    System.out.print("Enter Student Email : ");
                    student.setStudent_email(scanner.nextLine());

                    System.out.println();
                    System.out.println();

                    System.out.println("Enter Department Details : ");
                    System.out.print("Enter Department id : ");
                    department.setDept_id(scanner.nextLine());
                    System.out.print("Enter Department Name : ");
                    department.setDept_name(scanner.nextLine());
                    System.out.print("Enter Department Head : ");
                    department.setDept_head(scanner.nextLine());

                    System.out.println();
                    System.out.println();

                    System.out.println("Is student willing to take Course yes -y or no -n");
                    System.out.print("Enter a value : ");
                    String courseOpinion = scanner.next();
                    courseOpinion = courseOpinion.toLowerCase();

                    switch (courseOpinion) {
                        case "y":

                            System.out.println("Enter Course Details : ");
                            System.out.print("Enter Course id : ");
                            scanner.nextLine();
                            course.setCourse_id(scanner.nextLine());
                            System.out.print("Enter Course Name : ");
                            course.setCourse_name(scanner.nextLine());
                            System.out.print("Enter Course Price : ");
                            course.setCourse_price(scanner.nextInt());
                            break;

                        case "n":
                            break;

                        default:
                            throw new IllegalStateException("Unexpected value: " + opinion);
                    }

                case "n":
                    break;

                default:
                    throw new IllegalStateException("Unexpected value: " + opinion);
            }

            if(student.getStudent_id() != null) {
                Student student1 = studentDaoImpl.addStudent(student);
                Department department1 = departmentDaoImpl.addDepartment(department);
                Course course1 = null;
                if (course != null) {
                    course1 = courseDaoImpl.addCourse(course);
                }
                relationshipDaoImpl.addRelationship("insert into relationship (student_id, dept_id, course_id) values " +
                        "(" + student1.getStudent_id() + ", " + department1.getDept_id() + ", " + course1.getCourse_id() + ")");
            } else {
                System.out.println("You have Successfully Exited...");
                break;
            }

        }

    }
}