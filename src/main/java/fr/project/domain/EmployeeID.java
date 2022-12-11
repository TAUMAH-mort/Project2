package fr.project.domain;

import java.io.Serializable;
import java.util.Objects;

public class EmployeeID implements Serializable {
    private String TypeOfID;
    private String ValueOfID;

    private EmployeeID(){}
    private EmployeeID(Builder builder){
        this.TypeOfID = builder.TypeOfID;
        this.ValueOfID = builder.ValueOfID;
    }
    public String getTypeOfID() {
        return TypeOfID;
    }
    public String getValueOfID(){
        return ValueOfID;
    }
    @Override
    public int hashCode() {
        return Objects.hash(TypeOfID, ValueOfID);
    }

    @Override
    public String toString() {
        return "Employee type of ID : "+TypeOfID+"\n"+"Employee value of ID : "+ValueOfID+"\n";
    }

    public static class Builder{
        private String TypeOfID;
        private String ValueOfID;

        public Builder setTypeOfID(String TypeOfID) {
            this.TypeOfID = TypeOfID;
            return this;
        }
        public Builder setValueOfID(String ValueOfID) {
            this.ValueOfID = ValueOfID;
            return this;
        }
        public Builder copy(EmployeeID employeeID){
            this.TypeOfID = employeeID.TypeOfID;
            this.ValueOfID = employeeID.ValueOfID;
            return this;
        }
        public EmployeeID build (){
            return new EmployeeID(this);
        }
    }
}
