package department;

import DBConnection.DataBaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class DepartmentDaoImpl implements DepartmentDao{

    DataBaseConnection DbConnection = new DataBaseConnection();

    @Override
    public Department addDepartment(Department department) {
        int result;
        String insertQuery = "insert into departments (dept_id, dept_name, dept_head) values (?, ?, ?)";
        Connection connection = DbConnection.getConnection();
        try {
            PreparedStatement ps = connection.prepareStatement(insertQuery);
            ps.setString(1, department.getDept_id());
            ps.setString(2, department.getDept_name());
            ps.setString(3, department.getDept_head());

            result = ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        if (result>0)
            return department;
        return null;
    }

    @Override
    public List<Department> getAllDepartments() {
        return List.of();
    }

    @Override
    public Department updateDepartment(Department department) {
        return null;
    }

    @Override
    public void deleteDepartmentById(String department_id) {

    }

    @Override
    public Department getDepartmentById(String department_id) {
        return null;
    }
}
