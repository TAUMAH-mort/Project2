package fr.project.domain;

import java.io.Serializable;
import java.util.Objects;

public class Employee implements Serializable {

    private String name;
    private int MandatoryNumber;

    private Employee(Builder builder){
        this.name =builder.name;
        this.MandatoryNumber = (builder.MandatoryNumber);
    }
    public String getName() {
        return name;
    }
    public int getMandatoryNumber() {
        return MandatoryNumber;
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, MandatoryNumber);
    }

    @Override
    public String toString() {
        return "Employee name : "+name+"\n"+"Employee Mandatory Number : "+MandatoryNumber+"\n";
    }
    public static class Builder{
        private String name;
        private int MandatoryNumber;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }
        public Builder setMandatoryNumber(int MandatoryNumber) {
            this.MandatoryNumber = MandatoryNumber;
            return this;
        }
        public Builder copy(Employee employee){
            this.name = employee.name;
            this.MandatoryNumber = employee.MandatoryNumber;
            return this;
        }
        public Employee build (){
            return new Employee(this);
        }
    }
}
