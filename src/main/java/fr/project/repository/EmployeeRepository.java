package fr.project.repository;

import fr.project.domain.Employee;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository{
    private static EmployeeRepository repository = null;
    private List<Employee> EmployeeDB = null;
    private EmployeeRepository(){
        EmployeeDB = new ArrayList<Employee>();
    }
    @Override
    public Employee create(Employee employee) {
        boolean success = EmployeeDB.add(employee);
        if(success)
            return employee;
        else
            return null;
    }
    public static EmployeeRepository getRepository(){
        if(repository == null){
            return new EmployeeRepository();
        }
        return repository;
    }
    @Override
    public Employee read (String s) {
        for (Employee r : EmployeeDB){
            if(r.getName().equals(s))
                return r;
        }
        return null;
    }

    @Override
    public Employee update(Employee employee) {
        Employee oldEmployee = read(employee.getName());
        if(employee != null){
            EmployeeDB.remove(oldEmployee);
            EmployeeDB.add(employee);
            return employee;
        }
        return null;
    }

    @Override
    public boolean delete(String s) {
        Employee employeeToDelete = read(s);
        if (employeeToDelete == null)
            return false;
        EmployeeDB.remove(employeeToDelete);
        return true;
    }

    @Override
    public List<Employee> getAll() {
        return EmployeeDB;
    }
}
