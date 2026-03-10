package com.springcore;

public class EmployeeServiceImpl implements EmployeeService {

    private String employeeName;

    // Default Constructor
    public EmployeeServiceImpl() {
        System.out.println("Employee Default Constructor Called");
    }

    // Parameterized Constructor
    public EmployeeServiceImpl(String employeeName) {
        this.employeeName = employeeName;
    }

    // Setter
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    @Override
    public void employeeDetails() {
        System.out.println("Employee Name is : " + employeeName);
    }
}
