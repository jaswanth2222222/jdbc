package course;

import java.util.List;

public interface CourseDao {

    Course addCourse(Course course);
    List<Course> getAllCourses();
    Course updateCourse(Course course);
    void deleteCourseById(String course_id);
    Course getCourseById(String course_id);

}
