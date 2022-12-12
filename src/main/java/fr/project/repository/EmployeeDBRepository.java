package fr.project.repository;

import fr.project.domain.EmployeeDB;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDBRepository implements IEmployeeDBRepository{
    private static EmployeeDBRepository repository = null;
    private List<EmployeeDB> employeeDBS = null;

    private EmployeeDBRepository(){
        employeeDBS = new ArrayList<EmployeeDB>();
    }

    @Override
    public EmployeeDB create(EmployeeDB employeeDB) {
        boolean success = employeeDBS.add(employeeDB);
        if( success)
            return employeeDB;
        else
            return null;
    }

    public static EmployeeDBRepository getRepository(){
        if(repository == null){
            return new EmployeeDBRepository();
        }
        return repository;
    }

    @Override
    public EmployeeDB read(String s) {
        for (EmployeeDB r : employeeDBS){
            if(r.getEmployee().equals(s))
                return r;
        }
        return null;
    }

    @Override
    public EmployeeDB update(EmployeeDB employeeDB) {
        EmployeeDB oldRace = read(String.valueOf(employeeDB.getEmployee()));
        if(employeeDB != null){
            employeeDBS.remove(oldRace);
            employeeDBS.add(employeeDB);
            return employeeDB;
        }
        return null;
    }

    @Override
    public boolean delete(String s) {
        EmployeeDB employeeDBToDelete = read(s);
        if (employeeDBToDelete == null)
            return false;
        employeeDBS.remove(employeeDBToDelete);
        return true;
    }

    @Override
    public List<EmployeeDB> getAll() {
        return employeeDBS;
    }
}
