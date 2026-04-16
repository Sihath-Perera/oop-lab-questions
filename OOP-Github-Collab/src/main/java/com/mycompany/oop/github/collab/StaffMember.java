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
    private static int staffCount = 0;
    
    public StaffMember(String fullName, String staffId, String department) {
        this.fullName = fullName;
        this.staffId = staffId;
        this.department = department;
        staffCount++;
    }
    public static void showSystemName() {
        System.out.println("Campus Staff Payment System");
    }
    public static int getStaffCount() {
        return staffCount;
    }
    public final void showCommonNotice() {
        System.out.println("Notice: Please submit your monthly reports by the 25th.");
    }
    public void changeDepartment(String newDepartment) {
        if (!newDepartment.isEmpty()) { // Only update if not empty [cite: 229]
            this.department = newDepartment;
        }
    }
    
    public String getFullName() { return fullName; }
    public String getStaffId() { return staffId; }
    public String getDepartment() { return department; }

    public final void displayBasicDetails() {
        System.out.println("ID: " + staffId + " | Name: " + fullName + " | Dept: " + department);
    }

    public abstract double calculateMonthlyPayment();
}
