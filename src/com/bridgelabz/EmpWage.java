package com.bridgelabz;

/**
 * Program using OOPS concept to check employee wage based on hours
 *
 * @author Shubham
 * @version 1.0
 * @since 10/08/2021
 */
public class EmpWage {
    int WAGE_PER_HR = 20 ;
    /**
     *  function checkWorkCase gives out if the employee is part timer or full timer using  switch case
     */
    public void checkWorkCase() {
        int emp_hrs=0 ;
        int emp_check;
        emp_check = (int) (Math.random() * 10) % 3;

        int time = emp_check;
        switch (time) {
            case 2:
                System.out.println("Employee is a full time worker");
                emp_hrs = 8;
                break;
            case 1:
                System.out.println("Employee is a part time worker");
                emp_hrs = 4;
                break;
            case 0:
                System.out.println("Employee data unavailable ");
                emp_hrs = 0;
                break;
        }

    }



    public static void main(String[] args) {
        System.out.println("Program to give out if the employee is a part timer or full timer ");
        System.out.println("__________________________________________________________________");
/**
 * Using methods
 * we use the methods created in class EmpWageCheck by making its object
 */
        EmpWage emp = new EmpWage();

        emp.checkWorkCase();


    }

}

