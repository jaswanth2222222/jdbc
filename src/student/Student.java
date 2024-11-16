package student;

public class Student {

    private String student_id;
    private String student_name;
    private String student_department;
    private String student_email;

    public Student() {
    }

    public Student(String student_name, String student_id, String student_email, String student_department) {
        this.student_name = student_name;
        this.student_id = student_id;
        this.student_email = student_email;
        this.student_department = student_department;
    }

    @Override
    public String toString() {
        return "Student{" +
                "student_department='" + student_department + '\'' +
                ", student_id='" + student_id + '\'' +
                ", student_name='" + student_name + '\'' +
                ", student_email='" + student_email + '\'' +
                '}';
    }

    public String getStudent_department() {
        return student_department;
    }

    public void setStudent_department(String student_department) {
        this.student_department = student_department;
    }

    public String getStudent_email() {
        return student_email;
    }

    public void setStudent_email(String student_email) {
        this.student_email = student_email;
    }

    public String getStudent_id() {
        return student_id;
    }

    public void setStudent_id(String student_id) {
        this.student_id = student_id;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }
}
