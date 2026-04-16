/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop.github.collab;

/**
 *
 * @author Sihath
 */

public abstract class StaffMember {
    private String fullName; 
    private final String staffId;
    protected String department; 

    public StaffMember(String fullName, String staffId, String department) {
        this.fullName = fullName;
        this.staffId = staffId;
        this.department = department;
    }

    public String getFullName() { return fullName; }
    public String getStaffId() { return staffId; }
    public String getDepartment() { return department; }

    public final void displayBasicDetails() {
        System.out.println("ID: " + staffId + " | Name: " + fullName + " | Dept: " + department);
    }

    public abstract double calculateMonthlyPayment();
}
