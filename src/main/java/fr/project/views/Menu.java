package fr.project.views;

import fr.project.domain.*;
import fr.project.factory.*;
import fr.project.repository.*;

import java.util.Scanner;

public class Menu {
    public static EmployeeRepository repository = EmployeeRepository.getRepository();
    public static void loadEmployee (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the employee : ");
        String name = scanner.next();
        System.out.println("Enter the mandatory number of the employee : ");
        int MandatoryNumber = scanner.nextInt();
        Employee employee = EmployeeFactory.createEmployee(name,MandatoryNumber);
        repository.create(employee);
        System.out.println(employee);
    }
    public static EmployeeDemographicRepository repository1 = EmployeeDemographicRepository.getRepository();
    public static void loadEmployeeDemographic(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the gender of the employee : ");
        String Gender = scanner.next();
        System.out.println("Enter the race of the employee : ");
        String Race = scanner.next();
        EmployeeDemographic employeeDemographic = EmployeeDemographicFactory.createEmployeeDemographic(Gender,Race);
        repository1.create(employeeDemographic);
        System.out.println(employeeDemographic);
    }
    public static EmployeeContactRepository repository2 = EmployeeContactRepository.getRepository();
    public static void loadEmployeeContact(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the cell phone number of the employee : ");
        String CellPhoneNumber = scanner.next();
        System.out.println("Enter the email of the employee : ");
        String Email = scanner.next();
        System.out.println("Enter the home number of the employee : ");
        int HomeNumber = Integer.parseInt(scanner.next());
        EmployeeContact employeeContact = EmployeeContactFactory.createEmployeeContact(CellPhoneNumber,Email,HomeNumber);
        repository2.create(employeeContact);
        System.out.println(employeeContact);
    }
    public static EmployeeAdressRepository repository3 = EmployeeAdressRepository.getRepository();
    public static void loadEmployeeAdress(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the street address of the employee : ");
        String StreetAddress = scanner.next();
        System.out.println("Enter the postal address of the employee : ");
        int PostalAddress = scanner.nextInt();
        EmployeeAdress employeeAdress = EmployeeAdressFactory.createEmployeeAdress(StreetAddress,PostalAddress);
        repository3.create(employeeAdress);
        System.out.println(employeeAdress);
    }
    public static EmployeeIDRepository repository4 = EmployeeIDRepository.getRepository();
    public static void loadEmployeeID(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the type of ID of the employee : ");
        String TypeOfID = scanner.next();
        System.out.println("Enter the value of ID of the employee : ");
        String ValueOfID = scanner.next();
        EmployeeID employeeID = EmployeeIDFactory.createEmployeeID(TypeOfID,ValueOfID);
        repository4.create(employeeID);
        System.out.println(employeeID);
    }
    public static EmployeePositionRepository repository5 = EmployeePositionRepository.getRepository();
    public static void loadEmployeePosition(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the title of the employee : ");
        String Title = scanner.next();
        System.out.println("Enter the position code of the employee : ");
        int PositionCode = scanner.nextInt();
        EmployeePosition employeePosition = EmployeePositionFactory.createEmployeePosition(Title,PositionCode,"");
        repository5.create(employeePosition);
        System.out.println(employeePosition);
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
                    loadEmployee();
                    repository.getAll();
                    loadEmployeeDemographic();
                    repository1.getAll();
                    loadEmployeeContact();
                    repository2.getAll();
                    loadEmployeeAdress();
                    repository3.getAll();
                    loadEmployeeID();
                    repository4.getAll();
                    loadEmployeePosition();
                    repository5.getAll();
                    System.out.println("If you want to display all employee information enter 5 : ");
                    choice = sc.nextInt();
                    break;
                case 5:
                    System.out.println(repository.getAll());
                    System.out.println(repository1.getAll());
                    System.out.println(repository2.getAll());
                    System.out.println(repository3.getAll());
                    System.out.println(repository4.getAll());
                    System.out.println(repository5.getAll());
                    System.out.println("If you want to update an employee enter 6 : ");
                    choice = sc.nextInt();
                    break;
                case 6:

            }
        }
    }
}
