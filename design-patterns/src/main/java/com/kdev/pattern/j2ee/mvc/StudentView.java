package com.kdev.pattern.j2ee.mvc;

/**
 * @author trovo.st@gmail.com
 * 2018-01-20
 */
public class StudentView {
    public void printStudentDetails(String studentName, String studentRollNo){
        System.out.println("Student: ");
        System.out.println("Name: " + studentName);
        System.out.println("Roll No: " + studentRollNo);
    }
}
