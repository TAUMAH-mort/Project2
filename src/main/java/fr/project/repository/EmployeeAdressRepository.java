package fr.project.repository;

import fr.project.domain.Employee;
import fr.project.domain.EmployeeAdress;

import java.util.ArrayList;
import java.util.List;

public class EmployeeAdressRepository implements IEmployeeAdressRepository{
    private static EmployeeAdressRepository repository = null;
    private List<EmployeeAdress> EmployeeDB = null;
    private EmployeeAdressRepository(){
        EmployeeDB = new ArrayList<EmployeeAdress>();
    }
    @Override
    public EmployeeAdress create(EmployeeAdress employeeAdress) {
        boolean success = EmployeeDB.add(employeeAdress);
        if(success)
            return employeeAdress;
        else
            return null;
    }
    public static EmployeeAdressRepository getRepository(){
        if(repository == null){
            return new EmployeeAdressRepository();
        }
        return repository;
    }
    @Override
    public EmployeeAdress read (String s) {
        for (EmployeeAdress r : EmployeeDB){
            if(r.getStreetAdress().equals(s))
                return r;
        }
        return null;
    }

    @Override
    public EmployeeAdress update(EmployeeAdress employeeAdress) {
        EmployeeAdress oldEmployeeAdress = read(employeeAdress.getStreetAdress());
        if(employeeAdress != null){
            EmployeeDB.remove(oldEmployeeAdress);
            EmployeeDB.add(employeeAdress);
            return employeeAdress;
        }
        return null;
    }

    @Override
    public boolean delete(String s) {
        EmployeeAdress employeeAdressToDelete = read(s);
        if (employeeAdressToDelete == null)
            return false;
        EmployeeDB.remove(employeeAdressToDelete);
        return true;
    }
    @Override
    public List<EmployeeAdress> getAll() {
        return EmployeeDB;
    }
}