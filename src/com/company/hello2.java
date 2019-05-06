package com.company;


class Employee{
    String name;
    int age;
    String designation;
    double salary;
    // Employee 类的构造器
    public Employee(String name){
        this.name = name;
    }
    // 设置age的值
    public void empAge(int empAge){
        age =  empAge;
    }
    /* 设置designation的值*/
    public void empDesignation(String empDesig){
        designation = empDesig;
    }
    /* 设置salary的值*/
    public void empSalary(double empSalary){
        salary = empSalary;
    }
    /* 打印信息 */
    public void printEmployee(){
        System.out.println("Name:"+ name );
        System.out.println("Age:" + age );
        System.out.println("Designation:" + designation );
        System.out.println("Salary:" + salary);
    }
}

class employTest{
    Employee empOne;

    public void set(Employee xx){
        empOne=xx;
    }
}



public class hello2{

    public static void main(String args[]){
        /* 使用构造器创建两个对象 */
        Employee empOne = new Employee("James Smith");
        Employee empTwo = new Employee("Mary Anne");

        employTest test=new employTest();
        test.set(empOne);
        System.out.println(test.empOne.name);
    }
}