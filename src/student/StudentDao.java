package student;

import java.util.List;

public interface StudentDao {

    Student addStudent(Student student);
    List<Student> getAllStudents();
    Student updateStudent(Student student);
    void deleteStudentById(String student_id);
    Student getStudentById(String student_id);

}
