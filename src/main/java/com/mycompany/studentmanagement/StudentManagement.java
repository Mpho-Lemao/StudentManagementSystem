/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.studentmanagement;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class StudentManagement {

    public static void main(String[] args) {
        System.out.println("Welcome to the Student Management System!");
        Scanner scanner = new Scanner(System.in);
        School school = new School();
        int choice = 0;
        String name, name2, subject;
        int age;
        int id;
        int grade;
        
        while(choice != 6){
            boolean idFound = false;
            System.out.println("What do you want to do?");
            System.out.println("1. Add Student   2. Remove Student   3. Edit Student   4. Add grades   5. Display Average   6. EXIT");
            try{
                choice = scanner.nextInt();
                
                switch (choice){
                    case 1:
                        //Create a new student
                        System.out.print("Enter Student's name: ");
                        name = scanner.next();
                        System.out.print("Enter Student's age: ");
                        age = scanner.nextInt();
                        System.out.print("Enter Student's ID: ");
                        id = scanner.nextInt();
                        school.addStudent(name, age, id);

                        System.out.println("Student " + name + " successfully added");
                        break;
                    case 2:
                        //Remove an existing student
                        System.out.print("Enter Student's name: ");
                        name = scanner.next();
                        System.out.print("Enter Student's age: ");
                        age = scanner.nextInt();
                        System.out.print("Enter Student's ID: ");
                        id = scanner.nextInt();
                        school.removeStudent(name, age, id);

                        System.out.println("Student " + name + " successfully removed");
                        break;
                    case 3:
                        //Edit an existing student if their name is in the system
                        System.out.print("Enter Student's name: ");
                        name = scanner.next();
                        System.out.print("Enter Student's new name: ");
                        name2 = scanner.next();
                        System.out.print("Enter Student's new age: ");
                        age = scanner.nextInt();
                        System.out.print("Enter Student's new ID: ");
                        id = scanner.nextInt();
                        school.editStudent(name, name2, age, id);

                        System.out.println(name2 + "'s details successfully edited");
                        break;

                    case 4:
                        //Add marks to a student's profile if their ID is in the system
                        System.out.print("Enter Student's ID: ");
                        id = scanner.nextInt();
                        for(Student student : school.students){
                            if(student.getId() == id){
                                System.out.print("How many subjects do you want to add?  ");
                                int i = scanner.nextInt();
                                for(int j = 0; j < i; j++){

                                    //Add subject to student's subject list
                                    System.out.print("Enter Subject: ");
                                    subject = scanner.next();
                                    student.addSubject(subject);

                                    //Add grade to student's grade list
                                    System.out.print("Enter Grade: ");
                                    grade = scanner.nextInt();
                                    student.addGrade(grade);
                                }
                                idFound = true;
                            }
                        }
                        if(!idFound){
                            System.out.println("Student is not in the list, try again!");
                        }
                        break;

                    case 5:
                        //Display a student's average if their ID is in the system
                        System.out.print("Enter Student's ID: ");
                        id = scanner.nextInt();
                        for(Student student : school.students){
                            if(student.getId() == id){
                                System.out.println(student.getName() + "'s average is: " + school.displayAverage(id));
                            }
                            idFound = true;
                        }
                        if(!idFound){
                            System.err.println("Student is not in the list, try again!");
                        }
                        break;

                    case 6:
                        System.out.println("Goodbye :)");
                        break;
                    default:
                        System.err.println("Incorrect option, try again");
                }
            }
            catch(InputMismatchException e){
                System.err.println("Only enter numbers here.\nProgram flow has reset, try again");
                scanner.nextLine();
            }
        }
    }
}
