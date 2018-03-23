package com.everyday.advance;

import java.util.*;

class CustomerInformationTemplate{
    public String firstName;
    public String lastName;
    public long mobileNumber;
    public String address;

    public CustomerInformationTemplate(String firstName, String lastName, long mobileNumber, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobileNumber = mobileNumber;
        this.address = address;
    }

    public CustomerInformationTemplate(){}

    @Override
    public String toString() {
        return firstName + " " + lastName + " " + mobileNumber + " " + address;
    }
}

public class CustomerInformation {
    public static void main(String[] args) {

        Set<CustomerInformationTemplate> customerContact = new LinkedHashSet<>();
        Map<String, CustomerInformationTemplate> details = new LinkedHashMap<String, CustomerInformationTemplate>();

        Scanner read = new Scanner(System.in);
        //CustomerInformationTemplate cit = new CustomerInformationTemplate();
        System.out.println("Customer Information");
        System.out.println("====================");
        for (int i = 0 ; i < 2 ; i ++) {
            System.out.print("First Name : ");
            String firstName = read.next();
            System.out.print("Last Name : ");
            String lastName = read.next();
            System.out.print("Mobile Number : ");
            long mobileNumber = read.nextLong();
            System.out.print("Address : ");
            String address = read.next();
            CustomerInformationTemplate cit = new CustomerInformationTemplate(firstName, lastName, mobileNumber, address);
            //customerContact.add(cit);
            details.put(cit.firstName + cit.lastName, cit);
        }
        System.out.println(details);
    }
}