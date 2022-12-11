package fr.project.factory;

import fr.project.domain.Employee;
import fr.project.domain.EmployeePosition;
import fr.project.util.Helper;

public class EmployeePositionFactory {
    public static EmployeePosition createEmployeePosition(String Title, int PositionCode, String Status){
        String s = Helper.generateName();
        if(Helper.isNullOrEmpty(String.valueOf(PositionCode))){
            return new EmployeePosition.Builder().setTitle(Title).setPositionCode(PositionCode).setStatus("OPEN").build();
        }
        if(Helper.isNullOrEmpty(Title)){
            return null;
        }
        if(Helper.isNullOrEmpty(Status)){
            return new EmployeePosition.Builder().setTitle(Title).setPositionCode(PositionCode).setStatus("CLOSED").build();
        }
        return new EmployeePosition.Builder().setTitle(Title).setPositionCode(PositionCode).setStatus("CLOSED").build();
    }
}
