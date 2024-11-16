package student;

import DBConnection.DataBaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class StudentDaoImpl implements StudentDao{

    DataBaseConnection DbConnection = new DataBaseConnection();

    @Override
    public Student addStudent(Student student) {

        int result;
        String insertQuery = "insert into students (student_id, student_email, student_name, student_department) values (?, ?, ?, ?)";
        Connection connection = DbConnection.getConnection();
        try {
            PreparedStatement ps = connection.prepareStatement(insertQuery);
            ps.setString(1, student.getStudent_id());
            ps.setString(2, student.getStudent_email());
            ps.setString(3, student.getStudent_name());
            ps.setString(4, student.getStudent_department());

            result = ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        if (result>0)
            return student;
        return null;
    }

    @Override
    public List<Student> getAllStudents() {
        return List.of();
    }

    @Override
    public Student updateStudent(Student student) {
        return null;
    }

    @Override
    public void deleteStudentById(String student_id) {

    }

    @Override
    public Student getStudentById(String student_id) {
        return null;
    }
}
