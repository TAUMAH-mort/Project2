package fr.project.repository;

import fr.project.domain.EmployeeDemographic;
import fr.project.domain.EmployeeID;

import java.util.ArrayList;
import java.util.List;

public class EmployeeIDRepository implements IEmployeeIDRepository{
    private static EmployeeIDRepository repository = null;
    private List<EmployeeID> EmployeeDB = null;
    private EmployeeIDRepository(){
        EmployeeDB = new ArrayList<EmployeeID>();
    }
    @Override
    public EmployeeID create(EmployeeID employeeID) {
        boolean success = EmployeeDB.add(employeeID);
        if(success)
            return employeeID;
        else
            return null;
    }
    public static EmployeeIDRepository getRepository(){
        if(repository == null){
            return new EmployeeIDRepository();
        }
        return repository;
    }
    @Override
    public EmployeeID read (String s) {
        for (EmployeeID r : EmployeeDB){
            if(r.getTypeOfID().equals(s))
                return r;
        }
        return null;
    }

    @Override
    public EmployeeID update(EmployeeID employeeID) {
        EmployeeID oldEmployeeID = read(employeeID.getTypeOfID());
        if(employeeID != null){
            EmployeeDB.remove(oldEmployeeID);
            EmployeeDB.add(employeeID);
            return employeeID;
        }
        return null;
    }

    @Override
    public boolean delete(String s) {
        EmployeeID employeeIDToDelete = read(s);
        if (employeeIDToDelete == null)
            return false;
        EmployeeDB.remove(employeeIDToDelete);
        return true;
    }
    @Override
    public List<EmployeeID> getAll() {
        return EmployeeDB;
    }
}