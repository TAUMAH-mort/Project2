package fr.project.domain;

import java.util.Objects;

public class EmployeeContact {
    private String CellPhoneNumber;
    private String Email;
    private int HomeNumber;

    private EmployeeContact(){}
    private EmployeeContact(Builder builder){
        this.CellPhoneNumber =builder.CellPhoneNumber;
        this.Email = builder.Email;
        this.HomeNumber = builder.HomeNumber;
    }
    public String getCellPhoneNumber() {
        return CellPhoneNumber;
    }
    public String getEmail(){
        return Email;
    }
    public int getHomeNumber() {
        return HomeNumber;
    }
    @Override
    public int hashCode() {
        return Objects.hash(CellPhoneNumber,Email,HomeNumber);
    }

    @Override
    public String toString() {
        return "Employee cell phone number : "+CellPhoneNumber+"\n"+"Employee email : "+Email+"\n"+"Employee home number : "+HomeNumber+"\n";
    }

    public static class Builder{
        private String CellPhoneNumber;
        private String Email;
        private int HomeNumber;

        public Builder setCellPhoneNumber(String CellPhoneNumber) {
            this.CellPhoneNumber = CellPhoneNumber;
            return this;
        }

        public Builder setEmail(String Email) {
            this.Email = Email;
            return this;
        }

        public Builder setHomeNumber(int HomeNumber) {
            this.HomeNumber = HomeNumber;
            return this;
        }
        public Builder copy(EmployeeContact employeeContact){
            this.CellPhoneNumber = employeeContact.CellPhoneNumber;
            this.Email = employeeContact.Email;
            this.HomeNumber = employeeContact.HomeNumber;
            return this;
        }
        public EmployeeContact build (){
            return new EmployeeContact(this);
        }
    }
}
