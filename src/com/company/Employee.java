package com.company;

public class Employee {

     private int Id ;
     private  String Name;
     private String Address ;
     private String Phone ;

     public Employee(int Id , String Name , String Address , String Phone)
     {
          this.Id=Id;
          this.Name=Name;
          this.Address=Address ;
          this.Phone =Phone;
     }
     public void setName(String name) {
          Name = name;
     }

     public String getName() {
          return Name;
     }

     public int getId() {
          return Id;
     }

     public void setId(int id) {
          Id = id;
     }

     public void setAddress(String address) {
          Address = address;
     }

     public String getAddress() {
          return Address;
     }

     public String getPhone() {
          return Phone;
     }

     public void setPhone(String phone) {
          Phone = phone;
     }

     Department department = new Department (1, "Testing Dept");

     @Override
     public String toString() {
          return "Employee{" +
                  "Id=" + Id +
                  ", Name='" + Name + '\'' +
                  ", Address='" + Address + '\'' +
                  ", Phone='" + Phone + '\'' +
                  ", department=" + department +
                  '}'+
                  '\n'
                  ;
     }
}
