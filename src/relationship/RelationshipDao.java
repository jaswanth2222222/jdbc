package relationship;

import department.Department;

import java.util.List;

public interface RelationshipDao {

    void addRelationship(String insertQuery);
    void updateDepartment(Department department);
    void deleteDepartmentById(String department_id);

}
