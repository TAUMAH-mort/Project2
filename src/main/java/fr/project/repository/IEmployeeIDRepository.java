package fr.project.repository;

import fr.project.domain.EmployeeDemographic;
import fr.project.domain.EmployeeID;

import java.util.List;

public interface IEmployeeIDRepository extends IRepository<EmployeeID,String>{
    // create, read, update, delete
    public List<EmployeeID> getAll();
}
