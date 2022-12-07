package fr.project.factory;

import fr.project.domain.Employee;
import fr.project.util.Helper;

public class EmployeeFactory {
    public static Employee createEmployee(String name, int MandatoryNumber){
        String s = Helper.generateName();
        if(Helper.isNullOrEmpty(String.valueOf(MandatoryNumber))){
            return null;
        }
        if(Helper.isNullOrEmpty(name)){
            return null;
        }
        return new Employee.Builder().setName(name).setMandatoryNumber(MandatoryNumber).build();
    }

}
