package fr.project.repository;

import fr.project.domain.Employee;
import fr.project.domain.EmployeeDemographic;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDemographicRepository implements IEmployeeDemographicRepository{
    private static EmployeeDemographicRepository repository = null;
    private List<EmployeeDemographic> EmployeeDB = null;
    private EmployeeDemographicRepository(){
        EmployeeDB = new ArrayList<EmployeeDemographic>();
    }
    @Override
    public EmployeeDemographic create(EmployeeDemographic employeeDemographic) {
        boolean success = EmployeeDB.add(employeeDemographic);
        if(success)
            return employeeDemographic;
        else
            return null;
    }
    public static EmployeeDemographicRepository getRepository(){
        if(repository == null){
            return new EmployeeDemographicRepository();
        }
        return repository;
    }
    @Override
    public EmployeeDemographic read (String s) {
        for (EmployeeDemographic r : EmployeeDB){
            if(r.getGender().equals(s))
                return r;
        }
        return null;
    }

    @Override
    public EmployeeDemographic update(EmployeeDemographic employeeDemographic) {
        EmployeeDemographic oldEmployeeDemographic = read(employeeDemographic.getGender());
        if(employeeDemographic != null){
            EmployeeDB.remove(oldEmployeeDemographic);
            EmployeeDB.add(employeeDemographic);
            return employeeDemographic;
        }
        return null;
    }

    @Override
    public boolean delete(String s) {
        EmployeeDemographic employeeDemographicToDelete = read(s);
        if (employeeDemographicToDelete == null)
            return false;
        EmployeeDB.remove(employeeDemographicToDelete);
        return true;
    }
    @Override
    public List<EmployeeDemographic> getAll() {
        return EmployeeDB;
    }
}