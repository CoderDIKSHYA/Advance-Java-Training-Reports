package com.ram.springboot.entities;

import javax.persistence.*;

@Entity
@Table(name="employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="emp_id")
    private long empId;

    @Column(name="emp_name")
    private String empName;

    @Column(name="emp_sal")
    private long empSal;

    public long getEmpId() {
        return empId;
    }

    public void setEmpId(long empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public long getEmpSal() {
        return empSal;
    }

    public void setEmpSal(long empSal) {
        this.empSal = empSal;
    }

    public Employee() {}

    @Override
    public String toString() {
        return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + "]";
    }
}