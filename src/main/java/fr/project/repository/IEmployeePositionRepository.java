package fr.project.repository;

import fr.project.domain.Employee;
import fr.project.domain.EmployeePosition;

import java.util.List;

public interface IEmployeePositionRepository extends IRepository<EmployeePosition,String> {
    // create, read, update, delete

    public List<EmployeePosition> getAll();
}
