package fr.project.repository;

import fr.project.domain.Employee;
import fr.project.domain.EmployeeContact;

import java.util.ArrayList;
import java.util.List;

public class EmployeeContactRepository implements IEmployeeContactRepository {
    private static EmployeeContactRepository repository = null;
    private List<EmployeeContact> EmployeeDB = null;
    private EmployeeContactRepository(){
        EmployeeDB = new ArrayList<EmployeeContact>();
    }
    @Override
    public EmployeeContact create(EmployeeContact employeeContact) {
        boolean success = EmployeeDB.add(employeeContact);
        if(success)
            return employeeContact;
        else
            return null;
    }
    public static EmployeeContactRepository getRepository(){
        if(repository == null){
            return new EmployeeContactRepository();
        }
        return repository;
    }
    @Override
    public EmployeeContact read (String s) {
        for (EmployeeContact r : EmployeeDB){
            if(r.getCellPhoneNumber().equals(s))
                return r;
        }
        return null;
    }

    @Override
    public EmployeeContact update(EmployeeContact employeeContact) {
        EmployeeContact oldEmployeeContact = read(employeeContact.getCellPhoneNumber());
        if(employeeContact != null){
            EmployeeDB.remove(oldEmployeeContact);
            EmployeeDB.add(employeeContact);
            return employeeContact;
        }
        return null;
    }

    @Override
    public boolean delete(String s) {
        EmployeeContact employeeContactToDelete = read(s);
        if (employeeContactToDelete == null)
            return false;
        EmployeeDB.remove(employeeContactToDelete);
        return true;
    }
    @Override
    public List<EmployeeContact> getAll() {
        return EmployeeDB;
    }
}
