package fr.project.repository;

import fr.project.domain.EmployeeDB;

import java.util.List;

public interface IEmployeeDBRepository extends IRepository<EmployeeDB, String>{
    // create, read, update, delete
    public List<EmployeeDB> getAll();
}
