package com.kdev.pattern.j2ee.dao;

import java.util.List;

/**
 * @author trovo.st@gmail.com
 * 2018-01-20
 */
public interface StudentDao {
    public List<Student> getAllStudents();
    public Student getStudent(int rollNo);
    public void updateStudent(Student student);
    public void deleteStudent(Student student);
}
