package com.bridgelabz;

public class EmployeeWage {
    static final int IS_FULL_TIME = 1;

    public static void main(String[] args) {
        System.out.println("Welcome to wage computation");

        int empType = (int) (Math.random()*10) % 3;
        if(empType == IS_FULL_TIME){
            System.out.println("Employee is present");
        }
        else{
            System.out.println("Employee is absent");
        }

    }
}
