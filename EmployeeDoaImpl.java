package com.sjprogramming.empapp;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class EmployeeDoaImpl implements EmployeeDoaIntrf{
    Connection con;
    @Override
    public void createEmployee(Employee emp) {
        con= DBConnection.CreateDBConnection();
        String query="insert into employee values(?,?,?,?)";
        try{
            PreparedStatement pstm= con.prepareStatement(query);
            pstm.setInt(1,emp.getId());
            pstm.setString(2,emp.getName());
            pstm.setDouble(3,emp.getSalary());
            pstm.setInt(4,emp.getAge());
            int cnt= pstm.executeUpdate();
            if(cnt!=0){
                System.out.println("successful");
            }


    }catch (Exception ex) {
            ex.printStackTrace();

        }

        }

    @Override
    public void showAllEmployee() {
        con = DBConnection.CreateDBConnection();
        String query = "select * from employee;";
        System.out.println("Employee details: ");
        System.out.println("----------------------------------");
        System.out.format("%S\t%S\t%S\t\t\t%S\n" ,"id","name","salary","age");
        System.out.println("----------------------------------");
        try {
            Statement stmt = con.createStatement();
            ResultSet result = stmt.executeQuery(query);
            while (result.next()) {
                System.out.format("%d\t%s\t%f\t%d\n", result.getInt(1), result.getString(2), result.getDouble(3), result.getInt(4));
            }


        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void showEmployeeBasedOnId(int id) {
        con = DBConnection.CreateDBConnection();
        String query;
        query = "select * from employee where id=" +id;
        try{
            Statement stmt=con.createStatement();
            ResultSet result = stmt.executeQuery(query);
            while (result.next()) {
                System.out.format("%d\t%s\t%f\t%d\n", result.getInt(1), result.getString(2), result.getDouble(3), result.getInt(4));
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    @Override
    public void updateEmployee(int id, String name) {

    }

    @Override
    public void deleteEmployee(int id) {

    }
}
