package com.sjprogramming.empapp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name;
        int id;
        EmployeeDoaIntrf doa = new EmployeeDoaImpl();
        System.out.println("Welcome");
        Scanner sc= new Scanner(System.in);
        do{
            System.out.println("1. Add employee \n" +"2. show employee \n" +"3. show employee based on id\n" +"4. update the employee\n" +"5. delete the employee \n");
            System.out.println("enter choice");
            int ch= sc.nextInt();
            switch (ch){
                case 1:
                    Employee emp= new Employee();
                    System.out.println("enter id: ");
                    id= sc.nextInt();
                    System.out.println("enter name: ");
                    name= sc.next();
                    System.out.println("enter salary: ");
                    double salary= sc.nextDouble();
                    System.out.println("enter age: ");
                    int age= sc.nextInt();
                    emp.setId(id);
                    emp.setName(name);
                    emp.setSalary(salary);
                    emp.setAge(age);
                    doa.createEmployee(emp);
                    break;
                case 2:
                    doa.showAllEmployee();
                    break;
                case 3:
                    System.out.println("enter id:");
                    int empid= sc.nextInt();
                    doa.showEmployeeBasedOnId(empid);
                    break;
                case 4:
                    System.out.println("enter id to update:");
                    int empid1= sc.nextInt();
                    System.out.println("enter name to update:");
                    name=sc.next();
                    doa.updateEmployee(empid1,name);
                case 6:
                    System.out.println("thank you ");
                    System.exit(0);
                default:
                    System.out.println("enter valid choice");
                    break;
            }
        }while(true);

    }
}
