/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.oop.github.collab;

/**
 *
 * @author Sihath
 */
public class Lab04Main {
    public static void main(String[] args) {
        
        StaffMember.showSystemName();
        
        UniversityPolicy.showPolicyHeader();
        System.out.println("University Name: " + UniversityPolicy.UNIVERSITY_NAME);
        System.out.println();

        Lecturer lec1 = new Lecturer("Pathum Srinath", "L101", "Physics", 3, 50000.0);
        Lecturer lec2 = new Lecturer("Amara Silva", "L102", "Electronics", 2, 45000.0);
        LabAssistant ast1 = new LabAssistant("Saman Kumara", "A201", "Chemistry", 40, 1500.0);

        lec1.changeDepartment("Advanced Physics");

        StaffMember[] staffList = {lec1, lec2, ast1};
        double totalMonthlyPayment = 0;

        for (StaffMember s : staffList) {
            s.displayBasicDetails();
            double payment = s.calculateMonthlyPayment();
            System.out.println("Monthly Payment: " + payment);
            
            // Calculate bonus using policy class [cite: 197]
            double bonus = UniversityPolicy.calculateBonus(payment);
            System.out.println("Bonus Estimate: " + bonus);
            
            s.showCommonNotice();
            
            totalMonthlyPayment += payment;
            System.out.println("----------------------------------");
        }

        System.out.println("Total Monthly Payment for all Staff: " + totalMonthlyPayment);
        System.out.println("Total Number of Staff Created: " + StaffMember.getStaffCount());
    }
}