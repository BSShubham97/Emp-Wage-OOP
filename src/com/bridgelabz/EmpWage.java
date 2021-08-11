package com.bridgelabz;

import java.util.Scanner;

/**
 * Program using OOPS concept to check employee wage based on hours for a number of days
 *
 * @author Shubham
 * @version 1.0
 * @since 10/08/2021
 */
public class EmpWage {
    int WAGE_PER_HR = 20 ;
    /**
     *  function checkWorkCase gives out the employee wages total for a number of days below 100 hours on hours
     */
    public void outHourWageLim(int hours ,int number) {
        int i;
        int emp_check;
        int emp_work_time;
        int total_work_time = 0;

        for (i = 1; i <= number; i++) //Repeating the loop for 20 days
        {
            if (total_work_time <= hours) //to keep the working hours under limit
            {
                System.out.println("DAY:" + i);
                emp_check = (int) (Math.random() * 10) % 2;
                int attend = emp_check;

                switch (attend) {
                    case 1:
                        emp_work_time = (int) (Math.random() * 10) % 9;
                        total_work_time = total_work_time + emp_work_time;
                        System.out.println("This days work time: " + emp_work_time);
                        break;
                    case 0:
                        emp_work_time = 0;
                        total_work_time = total_work_time + emp_work_time;
                        System.out.println("This days work time: " + emp_work_time);
                        break;

                }
            }
        }
        System.out.println("Total working hours: "+total_work_time+"hrs");
        int total_pay = total_work_time * 20;


        System.out.println("Total wage of the Employee: " + total_pay);
    }

    public static void main(String[] args) {
        System.out.println("Program to give out employee wages for a month ");
        System.out.println("__________________________________________________________________");
/**
 * Using methods
 * we use the methods created in class EmpWageCheck by making its object
 */
        EmpWage emp = new EmpWage();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the limit of working hours of a month:");
        int hour=scanner.nextInt();
        System.out.println("Enter the days of a month:");
        int number=scanner.nextInt();
        emp.outHourWageLim(hour,number);


    }

}

