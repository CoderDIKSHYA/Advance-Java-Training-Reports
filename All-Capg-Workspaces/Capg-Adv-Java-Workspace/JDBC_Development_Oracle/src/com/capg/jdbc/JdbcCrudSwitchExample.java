package com.capg.jdbc;

import java.sql.*;
import java.util.Scanner;

public class JdbcCrudSwitchExample {

    public static void main(String[] args) {

        String url = "jdbc:oracle:thin:@localhost:1521/XE";
        String userName = "scott";
        String password = "DEVI";

        Scanner sc = new Scanner(System.in);
        Connection conn = null;

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn = DriverManager.getConnection(url, userName, password);

            int choice;

            do {
                System.out.println("\n----- MENU -----");
                System.out.println("1. Insert Record");
                System.out.println("2. View All Records");
                System.out.println("3. Delete Record");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");

                choice = sc.nextInt();

                switch (choice) {

                    
                    case 1:
                        System.out.print("Enter Employee ID: ");
                        int id = sc.nextInt();

                        System.out.print("Enter Employee Name: ");
                        String name = sc.next();

                        System.out.print("Enter Salary: ");
                        int sal = sc.nextInt();

                        PreparedStatement ps =
                                conn.prepareStatement(
                                "INSERT INTO Employeeinfo1 VALUES (?, ?, ?)");

                        ps.setInt(1, id);
                        ps.setString(2, name);
                        ps.setInt(3, sal);

                        ps.executeUpdate();
                        System.out.println("Record Inserted Successfully");
                        break;

                    
                    case 2:
                        Statement stmt = conn.createStatement();
                        ResultSet rs =
                                stmt.executeQuery("SELECT * FROM Employeeinfo1");

                        System.out.println("\nEmpNo\tName\tSalary");
                        System.out.println("-------------------------");

                        while (rs.next()) {
                            System.out.println(
                                    rs.getInt(1) + "\t" +
                                    rs.getString(2) + "\t" +
                                    rs.getInt(3));
                        }
                        break;

                    
                    case 3:
                        System.out.print("Enter Employee ID to delete: ");
                        int delId = sc.nextInt();

                        PreparedStatement psDel =
                                conn.prepareStatement(
                                "DELETE FROM Employeeinfo1 WHERE empno=?");

                        psDel.setInt(1, delId);
                        int rows = psDel.executeUpdate();

                        if (rows > 0)
                            System.out.println("Record Deleted Successfully");
                        else
                            System.out.println("Record Not Found");
                        break;

                    
                    case 4:
                        System.out.println("Exiting Program...");
                        break;

                    default:
                        System.out.println("Invalid Choice");
                }

            } while (choice != 4);

        }
        catch (SQLException se) {
            se.printStackTrace();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            try {
                if (conn != null)
                    conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            sc.close();
        }
    }
}
