package relationship;

import java.util.Optional;

public class Relationship {

    private String student_id;
    private String course_id;
    private String department_id;

    public Relationship() {
    }

    public Relationship(String course_id, String department_id, Optional<String> student_id) {
        this.course_id = course_id;
        this.department_id = department_id;
        this.student_id = student_id.orElse(null);
    }

    public String getCourse_id() {
        return course_id;
    }

    public void setCourse_id(String course_id) {
        this.course_id = course_id;
    }

    public String getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(String department_id) {
        this.department_id = department_id;
    }

    public String getStudent_id() {
        return student_id;
    }

    public void setStudent_id(String student_id) {
        this.student_id = student_id;
    }
}
