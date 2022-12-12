package fr.project.views;

import fr.project.domain.*;
import fr.project.factory.*;
import fr.project.repository.*;

public class Main{
    public static EmployeeRepository repository = EmployeeRepository.getRepository();
    public static void loadEmployee (){
        Employee employee1 = EmployeeFactory.createEmployee("Tomah",1);
        repository.create(employee1);
        System.out.println("Employee 1\n"+employee1);
    }
    public static EmployeeDemographicRepository repository1 = EmployeeDemographicRepository.getRepository();
    public static void loadEmployeeDemographic(){
        EmployeeDemographic employeeDemographic1 = EmployeeDemographicFactory.createEmployeeDemographic("Male","Blanc");
        repository1.create(employeeDemographic1);
        System.out.println("Employee demographic 1\n"+employeeDemographic1);
    }
    public static EmployeeContactRepository repository2 = EmployeeContactRepository.getRepository();

    public static void loadEmployeeContact(){
        EmployeeContact employeeContact1 = EmployeeContactFactory.createEmployeeContact("0781339067","thom.floch@gmail.com",410);
        repository2.create(employeeContact1);
        System.out.println("Employee contact 1\n"+employeeContact1);
    }

    public static EmployeeAdressRepository repository3 = EmployeeAdressRepository.getRepository();

    public static void loadEmployeeAdress(){
        EmployeeAdress employeeAdress1 = EmployeeAdressFactory.createEmployeeAdress("Rue de l'Eglise",33420);
        repository3.create(employeeAdress1);
        System.out.println("Employee adress 1\n"+employeeAdress1);
    }

    public static EmployeeIDRepository repository4 = EmployeeIDRepository.getRepository();

    public static void loadEmployeeID(){
        EmployeeID employeeID1 = EmployeeIDFactory.createEmployeeID("Passport","ZG1234");
        repository4.create(employeeID1);
        System.out.println("Employee ID 1\n"+employeeID1);
    }

    public static EmployeePositionRepository repository5 = EmployeePositionRepository.getRepository();

    public static void loadEmployeePosition(){
        EmployeePosition employeePosition1 = EmployeePositionFactory.createEmployeePosition("Manager",2,"");
        repository5.create(employeePosition1);
        System.out.println("Employee position 1\n"+employeePosition1);
    }
    public static void main(String[] args) {
        loadEmployee();

    }
}