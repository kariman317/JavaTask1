package com.company;

import com.sun.org.apache.xpath.internal.objects.XString;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Department {
    private int Id ;
    private String Name ;
    List<Employee> employees = new ArrayList<Employee>();

//    public List<Employee> getEmployees() {
//        return employees;
//    }
    public Department (int Id , String Name)
    {
        this.Id = Id;
        this.Name=Name;
    }
    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public String toString() {
        return "Department{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", employees=" + employees +
                '}' ;
    }

    public void Add(Employee employee)
    {
        employees.add(employee);
    }
    public void Remove(Employee employee)
    {
        employees.remove(employee);
    }

}

