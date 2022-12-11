package fr.project.repository;

import fr.project.domain.Employee;
import fr.project.domain.EmployeePosition;

import java.util.ArrayList;
import java.util.List;

public class EmployeePositionRepository implements IEmployeePositionRepository{
    private static EmployeePositionRepository repository = null;
    private List<EmployeePosition> EmployeeDB = null;
    private EmployeePositionRepository(){
        EmployeeDB = new ArrayList<EmployeePosition>();
    }
    @Override
    public EmployeePosition create(EmployeePosition employeePosition) {
        boolean success = EmployeeDB.add(employeePosition);
        if(success)
            return employeePosition;
        else
            return null;
    }
    public static EmployeePositionRepository getRepository(){
        if(repository == null){
            return new EmployeePositionRepository();
        }
        return repository;
    }
    @Override
    public EmployeePosition read (String s) {
        for (EmployeePosition r : EmployeeDB){
            if(r.getTitle().equals(s))
                return r;
        }
        return null;
    }

    @Override
    public EmployeePosition update(EmployeePosition employeePosition) {
        EmployeePosition oldEmployeePosition = read(employeePosition.getTitle());
        if(employeePosition != null){
            EmployeeDB.remove(oldEmployeePosition);
            EmployeeDB.add(employeePosition);
            return employeePosition;
        }
        return null;
    }

    @Override
    public boolean delete(String s) {
        EmployeePosition employeePositionToDelete = read(s);
        if (employeePositionToDelete == null)
            return false;
        EmployeeDB.remove(employeePositionToDelete);
        return true;
    }


    @Override
    public List<EmployeePosition> getAll() {
        return EmployeeDB;
    }
}