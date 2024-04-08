package com.sjprogramming.empapp;

public interface EmployeeDoaIntrf {
    public void createEmployee (Employee emp);
    public void showAllEmployee();
    public void showEmployeeBasedOnId(int id) ;
    public void updateEmployee(int id, String name);
    public void deleteEmployee(int id);
}
