package department;

import java.util.List;

public interface DepartmentDao {

    Department addDepartment(Department department);
    List<Department> getAllDepartments();
    Department updateDepartment(Department department);
    void deleteDepartmentById(String department_id);
    Department getDepartmentById(String department_id);

}
