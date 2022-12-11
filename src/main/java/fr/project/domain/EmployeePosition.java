package fr.project.domain;

import java.io.Serializable;
import java.util.Objects;

public class EmployeePosition implements Serializable {
    private String Title;
    private int PositionCode;
    private String Status;

    private EmployeePosition(){}
    private EmployeePosition(Builder builder){
        this.Title =builder.Title;
        this.PositionCode = builder.PositionCode;
        this.Status = builder.Status;
    }
    public String getTitle() {
        return Title;
    }
    public int getMandatoryNumber() {
        return PositionCode;
    }
    public String getStatus(){
        return Status;
    }
    @Override
    public int hashCode() {
        return Objects.hash(Title, PositionCode, Status);
    }

    @Override
    public String toString() {
        return "Employee title job : "+Title+"\n"+"Employee position code : "+PositionCode+"\n"+"Employee status : "+Status+'\n';
    }

    public static class Builder{
        private String Title;
        private int PositionCode;

        private String Status;

        public Builder setTitle(String Title) {
            this.Title = Title;
            return this;
        }
        public Builder setPositionCode(int PositionCode) {
            this.PositionCode = PositionCode;
            return this;
        }

        public Builder setStatus(String Status){
            this.Status = Status;
                return this;
        }
        public Builder copy(EmployeePosition employeePosition){
            this.Title = employeePosition.Title;
            this.PositionCode = employeePosition.PositionCode;
            this.Status = employeePosition.Status;
            return this;
        }
        public EmployeePosition build (){
            return new EmployeePosition(this);
        }
    }
}