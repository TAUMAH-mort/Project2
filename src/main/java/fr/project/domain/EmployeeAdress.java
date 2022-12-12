package fr.project.domain;

import java.io.Serializable;
import java.util.Objects;

public class EmployeeAdress implements Serializable {
    private String StreetAdress;
    private int PostalAdress;
    private EmployeeAdress(){
    }
    private EmployeeAdress(Builder builder){
        this.StreetAdress = builder.StreetAdress;
        this.PostalAdress = builder.PostalAdress;
    }
    public String getStreetAdress() {
        return StreetAdress;
    }
    public int getPostalAdress() {
        return PostalAdress;
    }
    @Override
    public int hashCode() {
        return Objects.hash(StreetAdress,PostalAdress);
    }

    @Override
    public String toString() {
        return "Employee street adress : "+StreetAdress+"\n"+"Employee postal adress : "+PostalAdress+"\n";
    }

    public static class Builder{
        private String StreetAdress;
        private int PostalAdress;

        public Builder setSreetAdress(String StreetAdress) {
            this.StreetAdress = StreetAdress;
            return this;
        }
        public Builder setPostalAdress(int PostalAdress) {
            this.PostalAdress = PostalAdress;
            return this;
        }
        public Builder copy(EmployeeAdress employeeAdress){
            this.StreetAdress = employeeAdress.StreetAdress;
            this.PostalAdress = employeeAdress.PostalAdress;
            return this;
        }
        public EmployeeAdress build (){
            return new EmployeeAdress(this);
        }
    }
}
