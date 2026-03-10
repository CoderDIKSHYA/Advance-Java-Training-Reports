package com.capg.springboot;

public class ProductsBean {

    private int pid;
    private String pname;
    private double price;

    // Default Constructor (Required for JSON)
    public ProductsBean() {
    }

    // Parameterized Constructor
    public ProductsBean(int pid, String pname, double price) {
        this.pid = pid;
        this.pname = pname;
        this.price = price;
    }

    // Getters and Setters
    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}