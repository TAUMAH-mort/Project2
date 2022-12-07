package fr.project.repository;

import fr.project.domain.Employee;

import java.util.List;

public interface IEmployeeRepository extends IRepository<Employee,String> {
    // create, read, update, delete

    public List<Employee> getAll();
}
