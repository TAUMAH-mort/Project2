package fr.project.factory;

import fr.project.domain.*;
import fr.project.util.Helper;

public class EmployeeDBFactory {
    public static EmployeeDB createEmployeeDB(Employee employee, EmployeeDemographic employeeDemographic, EmployeeContact employeeContact, EmployeeAdress employeeAdress, EmployeeID employeeID, EmployeePosition employeePosition){
        String id = Helper.generateId();
        if (Helper.isNullOrEmpty(String.valueOf(employee)) ||Helper.isNullOrEmpty(String.valueOf(employeeDemographic)) || Helper.isNullOrEmpty(String.valueOf(employeeContact)) || Helper.isNullOrEmpty(String.valueOf(employeeAdress)) || Helper.isNullOrEmpty(String.valueOf(employeeID))) {
            return null;
        }
        EmployeeDB employeeDB = new EmployeeDB.Builder().setID(id).setEmployee(employee).setEmployeeDemographic(employeeDemographic).setEmployeeContact(employeeContact).setEmployeeAdress(employeeAdress).setEmployeeID(employeeID).setEmployeePosition(employeePosition).build();
        return employeeDB;
    }
}
