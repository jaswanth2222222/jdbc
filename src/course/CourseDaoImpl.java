package course;

import DBConnection.DataBaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class CourseDaoImpl implements CourseDao{

    DataBaseConnection DbConnection = new DataBaseConnection();

    @Override
    public Course addCourse(Course course) {
        int result;
        String insertQuery = "insert into courses (course_id, course_name, course_price) values (?, ?, ?)";
        Connection connection = DbConnection.getConnection();
        try {
            PreparedStatement ps = connection.prepareStatement(insertQuery);
            ps.setString(1, course.getCourse_id());
            ps.setString(2, course.getCourse_name());
            ps.setInt(3, course.getCourse_price());

            result = ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        if (result>0)
            return course;
        return null;
    }

    @Override
    public List<Course> getAllCourses() {
        return List.of();
    }

    @Override
    public Course updateCourse(Course course) {
        return null;
    }

    @Override
    public void deleteCourseById(String course_id) {

    }

    @Override
    public Course getCourseById(String course_id) {
        return null;
    }
}
