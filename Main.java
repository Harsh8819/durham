/*
File_Name            :-  OOP2_LAB-4.java .
Students Name and ID :-  Harsh Patel(100849927)
						 Kanvi Patel(100842924).
Date                 :-  04 DEC 2022.
Course Name	         :-  Object Oriented Programming - 2.
Course Code 		 :-  OOP3200.

*/

package ca.durhamcollege;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.Locale;


public class Main {

    public static void main(String[] args) {

        SalariedEmployee s1 = new SalariedEmployee("Harsh patel", LocalDate.of(1999, 01, 01), "100849927", 50000d);
        System.out.println(s1.calculatePayDay());

        HourlyWorker hw1 = new HourlyWorker("Kanvi patel", LocalDate.of(1999, 01, 01), "100842924", 18d, 40d);
        System.out.println(hw1.calculatePayDay());

        try {
            Employee[] employees = new Employee[5];
            employees[0] = new SalariedEmployee("Harsh patel", LocalDate.of(1999, 01, 01), "100849927", 50000d);
            employees[1] = new SalariedEmployee("Tom Tsiliopoulos", LocalDate.of(1999, 01, 01), "12345678", 50000d);
            employees[2] = new HourlyWorker("Kanvi patel", LocalDate.of(1999, 01, 01), "100842924", 18d, 47d);
            employees[3] = new HourlyWorker("Harsh patel", LocalDate.of(1999, 01, 01), "12345678", 18d, 40d);
            employees[4] = new HourlyWorker("Harsh patel", LocalDate.of(1999, 01, 01), "12345678", 18d, 40d);

            System.out.println("ID\t\t\tName\t\t\tPay");
            for (Employee e : employees) {
                String pay = NumberFormat.getCurrencyInstance(new Locale.Builder().setLanguage("en").setRegion("US").build()).format(e.calculatePayDay());
                System.out.println(e.getEmployeeId() + "\t" + e.getName() + "\t" + pay);

            }
        } catch (Exception e) {
            System.out.println("exception: " + e);
        }
    }

}
