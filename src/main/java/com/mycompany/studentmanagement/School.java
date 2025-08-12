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
public class School {
    ArrayList<Student> students = new ArrayList<>();
    
    void addStudent(String name, int age, int id){
        Student student = new Student();
        student.setName(name);
        student.setAge(age);
        student.setId(id);
        students.add(student);
        displayStudents();
    }
    
    void removeStudent(String name, int age, int id){
        for(int i =0; i < students.size(); i++){
            if(students.get(i).getName().equals(name) && students.get(i).getAge() == age && students.get(i).getId() == id){
                students.remove(students.get(i));
            }
        }
        displayStudents();
    }
    
    void editStudent(String name, String name2, int age, int id){
        for(Student student : students){
            if(student.getName().equals(name)){
                student.setName(name2);
                student.setAge(age);
                student.setId(id);
            }
        }
        displayStudents();
    }
    
    void displayStudents(){
        System.out.println("Current Students enrolled: ");
        for (Student student : students){
            System.out.println("Name: " + student.getName() + ".   Age: " + student.getAge() + ".   ID: " + student.getId());
        }
    }
    
    public double displayAverage(int id){
        double sum = 0;
        int total = 0;
        for (Student student : students){
            if(student.getId() == id){
                for(int grade: student.grades){
                    sum += grade;
                    total++;
                }
            }
        }
        return sum/total;
    }
}