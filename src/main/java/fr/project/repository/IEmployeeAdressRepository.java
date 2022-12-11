package fr.project.repository;

import fr.project.domain.Employee;
import fr.project.domain.EmployeeAdress;

import java.util.List;

public interface IEmployeeAdressRepository extends IRepository<EmployeeAdress, String>{
    // create, read, update, delete

    public List<EmployeeAdress> getAll();
}
