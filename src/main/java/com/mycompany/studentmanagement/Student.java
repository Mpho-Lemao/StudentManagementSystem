/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studentmanagement;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Student {
    private String name;
    private int age;
    private int idNumber;
    ArrayList<Integer> grades = new ArrayList<>();
    ArrayList<String> subjects = new ArrayList<>();

    Student(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.idNumber = id;
    }

    Student() {
        
    }
    
    //Getters and setters for private member variables
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getId(){
        return this.idNumber;
    }
    public void setId(int id){
        this.idNumber = id;
    }
    
    public void addGrade(int grade){
        grades.add(grade);
    }
    
    public void addSubject(String subject){
        subjects.add(subject);
    }
}
