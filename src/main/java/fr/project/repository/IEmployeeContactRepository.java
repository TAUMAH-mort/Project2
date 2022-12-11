package fr.project.repository;

import fr.project.domain.Employee;
import fr.project.domain.EmployeeContact;

import java.util.List;

public interface IEmployeeContactRepository extends IRepository<EmployeeContact,String>{
    // create, read, update, delete

    public List<EmployeeContact> getAll();
}
