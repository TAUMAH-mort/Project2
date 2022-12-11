package fr.project.domain;

import java.io.Serializable;
import java.util.Objects;

public class EmployeeDemographic implements Serializable {
    private String Gender;
    private String Race;

    private EmployeeDemographic(){}
    private EmployeeDemographic(Builder builder){
        this.Gender = builder.Gender;
        this.Race = builder.Race;
    }
    public String getGender() {
        return Gender;
    }
    public String getRace(){
        return Race;
    }
    @Override
    public int hashCode() {
        return Objects.hash(Gender, Race);
    }

    @Override
    public String toString() {
        return "Employee gender : "+Gender+"\n"+"Employee race : "+Race+"\n";
    }

    public static class Builder{
        private String Gender;
        private String Race;

        public Builder setGender(String Gender) {
            this.Gender = Gender;
            return this;
        }
        public Builder setRace(String Race) {
            this.Race = Race;
            return this;
        }
        public Builder copy(EmployeeDemographic employeeDemographic){
            this.Gender = employeeDemographic.Gender;
            this.Race = employeeDemographic.Race;
            return this;
        }
        public EmployeeDemographic build (){
            return new EmployeeDemographic(this);
        }
    }
}