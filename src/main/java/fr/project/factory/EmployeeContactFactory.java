package fr.project.factory;

import fr.project.domain.Employee;
import fr.project.domain.EmployeeContact;
import fr.project.util.Helper;

public class EmployeeContactFactory {
    public static EmployeeContact createEmployeeContact(String CellPhoneNumber, String Email, int HomeNumber){
        String s = Helper.generateName();
        if(Helper.isNullOrEmpty(CellPhoneNumber)){
            return null;
        }
        if(Helper.isNullOrEmpty(Email)){
            return null;
        }
        if(Helper.isNullOrEmpty(String.valueOf(HomeNumber))){
            return null;
        }
        return new EmployeeContact.Builder().setCellPhoneNumber(CellPhoneNumber).setEmail(Email).setHomeNumber(HomeNumber).build();
    }
}
