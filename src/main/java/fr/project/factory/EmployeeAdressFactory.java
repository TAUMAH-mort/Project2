package fr.project.factory;

import fr.project.domain.Employee;
import fr.project.domain.EmployeeAdress;
import fr.project.util.Helper;

public class EmployeeAdressFactory {
    public static EmployeeAdress createEmployeeAdress(String SreetAdress, int PostalAdress){
        String s = Helper.generateName();
        if(Helper.isNullOrEmpty(String.valueOf(PostalAdress))){
            return null;
        }
        if(Helper.isNullOrEmpty(SreetAdress)){
            return null;
        }
        return new EmployeeAdress.Builder().setSreetAdress(SreetAdress).setPostalAdress(PostalAdress).build();
    }
}
