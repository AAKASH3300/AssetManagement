package com.task.asset.commonServices;

public class EmployeeCodeGeneration {
    private static final String PREFIX = "emp_";
    private static int counter = 1; // Starting number

    public synchronized String generateEmployeeCode() {
        String employeeCode = PREFIX + counter;
        counter++;
        return employeeCode;
    }
}
