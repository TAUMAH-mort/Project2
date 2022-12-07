package fr.project;

import fr.project.domain.Employee;
import fr.project.factory.EmployeeFactory;
import fr.project.repository.EmployeeRepository;

public class Main {
    public static EmployeeRepository repository = EmployeeRepository.getRepository();
    public static void loadEmployee (){
        Employee employee1 = EmployeeFactory.createEmployee("Tomah",1);
        Employee employee2 = EmployeeFactory.createEmployee("Ramy",2);
        Employee employee3 = EmployeeFactory.createEmployee("Marin",3);
        repository.create(employee1);
        repository.create(employee2);
        repository.create(employee3);
        System.out.println("Employee 1\n"+employee1);
        System.out.println("Employee 2\n"+employee2);
        System.out.println("Employee 3\n"+employee3);
    }

    public static void main(String[] args) {
        //EmployeeRepository repository = EmployeeRepository.getRepository();
        loadEmployee();
        //repository.getAll();
        //System.out.println(repository.getAll());
    }
}