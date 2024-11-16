package relationship;

import DBConnection.DataBaseConnection;
import department.Department;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RelationshipDaoImpl implements RelationshipDao{

    DataBaseConnection DbConnection = new DataBaseConnection();

    @Override
    public void addRelationship(String insertQuery) {
//        String insertQuery = "insert into relationship (student_id, dept_id, course_id) values (?, ?, ?)";
        int result;
        Connection connection = DbConnection.getConnection();
        try {
            PreparedStatement ps = connection.prepareStatement(insertQuery);
//            ps.setString(1, relationship.getStudent_id());
//            ps.setString(2, relationship.getDepartment_id());
//            if (relationship.getCourse_id() != null) {
//                ps.setString(3, relationship.getCourse_id());
//            } else {
//                ps.setString(3, "no course while joining");
//            }

            result = ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void updateDepartment(Department department) {

    }

    @Override
    public void deleteDepartmentById(String department_id) {

    }
}
