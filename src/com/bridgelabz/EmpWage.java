package com.bridgelabz;

/**
 * Program using OOPS concept to check if the employee is present or absent
 *
 * @author Shubham
 * @version 1.0
 * @since 10/08/2021
 */
public class EmpWage {
    /**
     * @return rand() gives out a number between 0 and 1
     */
    public int rand() {
        int emp_check;
        emp_check = (int) Math.floor(Math.random() * 10 % 2);
        return emp_check;
    }

    /**
     * @param emp_check is compared to 1
     *                  if emp_check is equal to 1 then the employee is present
     *                  else the employee is present i.e emp_check is equal to 0
     *                  ifpresent() gives out if the employee is present or absent
     */
    public void ifpresent(int emp_check) {
        if (emp_check == 1) {
            System.out.println("Employee is Present");
        } else
            System.out.println("Employee is Absent");
    }

    public static void main(String[] args) {
        System.out.println("Program to check if the employee is present or absent");
        System.out.println("Program to get total pay of the employee ");
        System.out.println("_______________________________________________________");
/**
 * Using methods
 * we use the methods created in class EmpWage by making its object
 */
        EmpWage emp = new EmpWage();
        int pres;
        pres = emp.rand();
        emp.ifpresent(pres);

    }

}
