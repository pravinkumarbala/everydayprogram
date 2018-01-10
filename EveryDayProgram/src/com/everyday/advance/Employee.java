package com.everyday.advance;

public class Employee {
    int employeeID;
    String employeeFirstName;
    String employeeLastName;
    double employeeSalary;

    public Employee(int employeeID, String employeeFirstName, String employeeLastName, double employeeSalary) {
        this.employeeID = employeeID;
        this.employeeFirstName = employeeFirstName;
        this.employeeLastName = employeeLastName;
        this.employeeSalary = employeeSalary;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getEmployeeFirstName() {
        return employeeFirstName;
    }

    public void setEmployeeFirstName(String employeeFirstName) {
        this.employeeFirstName = employeeFirstName;
    }

    public String getEmployeeLastName() {
        return employeeLastName;
    }

    public void setEmployeeLastName(String employeeLastName) {
        this.employeeLastName = employeeLastName;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    @Override
    public String toString(){
        return String.format("ID : %d \n" +
                "FirstName : %s \n" +
                "LastName : %s \n" +
                "Salary : %.2f %n", getEmployeeID(), getEmployeeFirstName(), getEmployeeLastName(), getEmployeeSalary());
    }
}