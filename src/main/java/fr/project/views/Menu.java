package fr.project.views;

import fr.project.domain.*;
import fr.project.factory.*;
import fr.project.repository.*;

import java.util.List;
import java.util.Scanner;

public class Menu {
    public static EmployeeRepository repository = EmployeeRepository.getRepository();
    public static Employee loadEmployee (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the employee : ");
        String name = scanner.next();
        System.out.println("Enter the mandatory number of the employee : ");
        int MandatoryNumber = scanner.nextInt();
        Employee employee = EmployeeFactory.createEmployee(name,MandatoryNumber);
        repository.create(employee);
        return employee;
    }
    public static EmployeeDemographicRepository repository1 = EmployeeDemographicRepository.getRepository();
    public static EmployeeDemographic loadEmployeeDemographic(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the gender of the employee : ");
        String Gender = scanner.next();
        System.out.println("Enter the race of the employee : ");
        String Race = scanner.next();
        EmployeeDemographic employeeDemographic = EmployeeDemographicFactory.createEmployeeDemographic(Gender,Race);
        repository1.create(employeeDemographic);
        return employeeDemographic;
    }
    public static EmployeeContactRepository repository2 = EmployeeContactRepository.getRepository();
    public static EmployeeContact loadEmployeeContact(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the cell phone number of the employee : ");
        String CellPhoneNumber = scanner.next();
        System.out.println("Enter the email of the employee : ");
        String Email = scanner.next();
        System.out.println("Enter the home number of the employee : ");
        int HomeNumber = Integer.parseInt(scanner.next());
        EmployeeContact employeeContact = EmployeeContactFactory.createEmployeeContact(CellPhoneNumber,Email,HomeNumber);
        repository2.create(employeeContact);
        return employeeContact;
    }
    public static EmployeeAdressRepository repository3 = EmployeeAdressRepository.getRepository();
    public static EmployeeAdress loadEmployeeAdress(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the street address of the employee : ");
        String StreetAddress = scanner.nextLine();
        System.out.println("Enter the postal address of the employee : ");
        int PostalAddress = scanner.nextInt();
        EmployeeAdress employeeAdress = EmployeeAdressFactory.createEmployeeAdress(StreetAddress,PostalAddress);
        repository3.create(employeeAdress);
        return employeeAdress;
    }
    public static EmployeeIDRepository repository4 = EmployeeIDRepository.getRepository();
    public static EmployeeID loadEmployeeID(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the type of ID of the employee : ");
        String TypeOfID = scanner.next();
        System.out.println("Enter the value of ID of the employee : ");
        String ValueOfID = scanner.next();
        EmployeeID employeeID = EmployeeIDFactory.createEmployeeID(TypeOfID,ValueOfID);
        repository4.create(employeeID);
        return employeeID;
    }
    public static EmployeePositionRepository repository5 = EmployeePositionRepository.getRepository();
    public static EmployeePosition loadEmployeePosition(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the title of the employee : ");
        String Title = scanner.next();
        System.out.println("Enter the position code of the employee : ");
        int PositionCode = scanner.nextInt();
        if(PositionCode == 0){
            EmployeePosition employeePosition = EmployeePositionFactory.createEmployeePosition(Title,PositionCode,"OPEN");
            repository5.create(employeePosition);
            return employeePosition;
        }
        else {
            EmployeePosition employeePosition = EmployeePositionFactory.createEmployeePosition(Title, PositionCode, "CLOSED");
            repository5.create(employeePosition);
            return employeePosition;
        }
    }
    public static EmployeeDBRepository repository6 = EmployeeDBRepository.getRepository();

    public static void loadEmployeeDB(){
        EmployeeDB employeeDB = EmployeeDBFactory.createEmployeeDB(loadEmployee(),loadEmployeeDemographic(),loadEmployeeContact(),loadEmployeeAdress(),loadEmployeeID(),loadEmployeePosition());
        repository6.create(employeeDB);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome in the Payroll System Application Menu of STARTUP \n");
        System.out.println("Please enter number 1 if you want to go into the Presentation Layer\n");
        System.out.println("Please enter number 2 if you want to go into the Service Layer\n");
        System.out.println("Please enter number 3 if you want to go into the Data Storage Layer (Repository)\n");
        System.out.println("Please enter number 0 if you want to exit the program\n");
        System.out.println("Enter your number : ");
        int choice = sc.nextInt();
        System.out.println("You have selected the following number : " +choice+"\n");
        while (choice != 0){
            switch (choice){
                case 1:
                    System.out.println("Welcome in the Presentation Layer\n");
                    System.out.println("You are currently using the Payroll Application of STARTUP\n");
                    System.out.println("The new and fastgrowing company located in the Western Cape, with headquarters in Cape Town\n");
                    System.out.println("STARTUP now has 2000 employees\n");
                    System.out.println("If you want to access the Service Layer, please enter 2 : ");
                    System.out.println("If you want to access the Data Storage Layer(Repository), please enter 3 : ");
                    System.out.println("If you want to exit, please enter 0 : ");
                    choice = sc.nextInt();
                    break;
                case 2:
                    System.out.println("Welcome in the Service Layer\n");
                    System.out.println("If you want to create a new employee enter 4 : ");
                    choice = sc.nextInt();
                    break;
                case 3:
                    System.out.println("Welcome in the Data Storage Layer (Repository)\n");
                case 4:
                    loadEmployeeDB();
                    System.out.println("If you want to display all employee information enter 5 : ");
                    choice = sc.nextInt();
                    break;
                case 5:
                    System.out.println(repository6.getAll());
                    System.out.println("If you want to delete an employee enter 6 : ");
                    choice = sc.nextInt();
                    break;
                case 6:
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Enter the name of the employee you want to delete : ");
                    repository6.delete(scanner.next());
                    System.out.println(repository6.getAll());
            }
        }
    }
}
