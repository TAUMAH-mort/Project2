package fr.project.factory;

import fr.project.domain.Employee;
import fr.project.domain.EmployeePosition;
import fr.project.util.Helper;

public class EmployeePositionFactory {
    public static EmployeePosition createEmployeePosition(String Title, int PositionCode, String Status){
        String s = Helper.generateName();
        if(Helper.isNullOrEmpty(String.valueOf(PositionCode))){
            return null;
        }
        if(Helper.isNullOrEmpty(Title)){
            return null;
        }
        if(Helper.isNullOrEmpty(Status)){
            return null;
        }
        return new EmployeePosition.Builder().setTitle(Title).setPositionCode(PositionCode).setStatus(Status).build();
    }
}
