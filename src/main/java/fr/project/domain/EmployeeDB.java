package fr.project.domain;

import java.io.Serializable;

public class EmployeeDB implements Serializable {

    private String ID;
    private Employee employee;
    private EmployeeDemographic employeeDemographic;
    private EmployeeContact employeeContact;
    private EmployeeAdress employeeAdress;
    private EmployeeID employeeID;
    private EmployeePosition employeePosition;
    private EmployeeDB(Builder builder){
        this.employee = builder.employee;
        this.employeeDemographic = builder.employeeDemographic;
        this.employeeContact = builder.employeeContact;
        this.employeeAdress = builder.employeeAdress;
        this.employeeID = builder.employeeID;
        this.employeePosition = builder.employeePosition;
        this.ID = builder.ID;
    }

    public String getID() {
        return ID;
    }

    public Employee getEmployee() {
        return employee;
    }

    public EmployeeDemographic getEmployeeDemographic() {
        return employeeDemographic;
    }

    public EmployeeContact getEmployeeContact() {
        return employeeContact;
    }

    public EmployeeAdress getEmployeeAdress() {
        return employeeAdress;
    }

    public EmployeeID getEmployeeID() {
        return employeeID;
    }

    public EmployeePosition getEmployeePosition() {
        return employeePosition;
    }

    @Override
    public String toString() {
        return ""+employee + employeeDemographic + employeeContact + employeeAdress + employeeID + employeePosition + "ID : "+ID+"\n";
    }
    public static class  Builder {
        private String ID;
        private Employee employee;
        private EmployeeDemographic employeeDemographic;
        private EmployeeContact employeeContact;
        private EmployeeAdress employeeAdress;
        private EmployeeID employeeID;
        private EmployeePosition employeePosition;

        public Builder setEmployee(Employee employee) {
            this.employee = employee;
            return this;
        }
        public Builder setEmployeeDemographic(EmployeeDemographic employeeDemographic) {
            this.employeeDemographic = employeeDemographic;
            return this;
        }
        public Builder setEmployeeContact(EmployeeContact employeeContact) {
            this.employeeContact = employeeContact;
            return this;
        }
        public Builder setEmployeeAdress(EmployeeAdress employeeAdress) {
            this.employeeAdress = employeeAdress;
            return this;
        }
        public Builder setEmployeeID(EmployeeID employeeID) {
            this.employeeID = employeeID;
            return this;
        }
        public Builder setEmployeePosition(EmployeePosition employeePosition) {
            this.employeePosition = employeePosition;
            return this;
        }
        public Builder setID(String ID) {
            this.ID = ID;
            return this;
        }
        public EmployeeDB build(){
            return new EmployeeDB(this);
        }
    }
}
