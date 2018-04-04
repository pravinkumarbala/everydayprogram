package com.everyday;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee implements Comparable<Employee>{
    private String empName;
    private int empId;

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public int compareTo(Employee compareEmployee){
        int employeeId = ((Employee)compareEmployee).getEmpId();

        //Ascending Order
        return this.empId - employeeId;

        //Descending Order
        //return employeeId - this.empId;
    }

    public Employee(String empName, int empId) {
        this.empName = empName;
        this.empId = empId;
    }

    public static Comparator<Employee> EmployeeNameComparator = new Comparator<Employee>() {
        @Override
        public int compare(Employee o1, Employee o2) {
            String firstEmployee = o1.empName.toUpperCase();
            String SecondEmployee = o2.empName.toUpperCase();

            //Ascending Order
            //return firstEmployee.compareTo(SecondEmployee);

            //Descending Order
            return SecondEmployee.compareTo(firstEmployee);
        }
    };
}

public class EmployeeComparatorAndComparable {
    public static void main(String[] args) {
        ArrayList<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(new Employee("Pravin", 105122));
        employeeList.add(new Employee("kumar", 105123));
        employeeList.add(new Employee("Ajay", 152332));
        employeeList.add(new Employee("Rajesh", 56473));
        employeeList.add(new Employee("Rahul", 152122));
        employeeList.add(new Employee("Dhone", 2342));

        Collections.sort(employeeList);
        System.out.println("Sort by ID");
        for (Employee employee: employeeList){
            System.out.println(employee.getEmpId() + " : " + employee.getEmpName());
        }
        System.out.println("*****************************");
        Collections.sort(employeeList, Employee.EmployeeNameComparator);
        System.out.println("Sort by Name");
        for (Employee employee: employeeList){
            System.out.println(employee.getEmpName() + " : " + employee.getEmpId());
        }
    }
}