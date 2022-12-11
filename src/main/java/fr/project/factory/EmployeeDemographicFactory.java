package fr.project.factory;

import fr.project.domain.EmployeeDemographic;
import fr.project.util.Helper;

public class EmployeeDemographicFactory {
    public static EmployeeDemographic createEmployeeDemographic(String Gender, String Race){
        String s = Helper.generateName();
        if(Helper.isNullOrEmpty(Gender)){
            return null;
        }
        if(Helper.isNullOrEmpty(Race)){
            return null;
        }
        return new EmployeeDemographic.Builder().setGender(Gender).setRace(Race).build();
    }
}
