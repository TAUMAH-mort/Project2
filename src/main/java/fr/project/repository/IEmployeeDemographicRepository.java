package fr.project.repository;

import fr.project.domain.Employee;
import fr.project.domain.EmployeeDemographic;

import java.util.List;

public interface IEmployeeDemographicRepository extends IRepository<EmployeeDemographic,String> {
    // create, read, update, delete
    public List<EmployeeDemographic> getAll();
}
