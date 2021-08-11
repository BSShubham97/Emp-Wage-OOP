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
     * @return randhrs() gives out a number between 1 and 8
     */
    public int randhrs() {
        int emp_hrs;
        emp_hrs = (int) Math.floor((Math.random() * 10 % 8)+1);
        if(emp_hrs<=4)
        {
            System.out.println("Employee Hours:"+emp_hrs);
            System.out.println("Employee is a Part Time Worker");
            return emp_hrs;
        }
        else{
            System.out.println("Employee Hours:"+emp_hrs);
            System.out.println("Employee is a Full Timer Worker");
            return emp_hrs;
        }
    }

    /**
     * @param emp_hrs gives the total working hours of and employee
     *
     *  totpay() gives out total pay
     */


    public void totpay(int emp_hrs) {
        int totalpay= WAGE_PER_HR * emp_hrs;
        System.out.println("Employees total pay for the days is :"+totalpay);
    }

    public static void main(String[] args) {
        System.out.println("Program to get total pay of the employee ");
        System.out.println("_______________________________________________________");
/**
 * Using methods
 * we use the methods created in class EmpWageUC2 by making its object
 */
        EmpWage emp = new EmpWage();
        int emp_hrs;
        emp_hrs= emp.randhrs();
        emp.totpay(emp_hrs);

    }

}

