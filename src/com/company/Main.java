package com.company;

public class Main {

    public static void main(String[] args) {

	// write your code here
        Employee kariman = new Employee(1 , "Kariman" , "Assuit" , "01013927000");
        Employee menna = new Employee(2 , "Menna" , "Assuit" , "010565989");
        Employee eman = new Employee(3 , "Eman" , "Assuit" , "010189590");
        Employee ahmed = new Employee(4 , "Ahmed" , "Assuit" , "0156695659");
        Employee yossief = new Employee(5 , "Yossief" , "Assuit" , "0114668526");

        //System.out.println(employee);
        Department department = new Department(1,"Testing");
        department.employees.add(kariman);
        department.employees.add(ahmed);
        department.employees.add(menna);
        department.employees.add(yossief);
        System.out.println(department);
        department.Add(new Employee(10,"Rana" , "Minia" , "012365655"));
        System.out.println(department);

    }
}
