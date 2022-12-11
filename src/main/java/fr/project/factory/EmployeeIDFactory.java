package fr.project.factory;

import fr.project.domain.EmployeeDemographic;
import fr.project.domain.EmployeeID;
import fr.project.util.Helper;

public class EmployeeIDFactory {
    public static EmployeeID createEmployeeID(String TypeOfID, String ValueOfID){
        String s = Helper.generateName();
        if(Helper.isNullOrEmpty(TypeOfID)){
            return null;
        }
        if(Helper.isNullOrEmpty(ValueOfID)){
            return null;
        }
        return new EmployeeID.Builder().setTypeOfID(TypeOfID).setValueOfID(ValueOfID).build();
    }
}
