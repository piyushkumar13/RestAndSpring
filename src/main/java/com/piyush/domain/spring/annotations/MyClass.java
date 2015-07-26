package com.piyush.domain.spring.annotations;

import javax.annotation.Resource;
import java.util.List;

public class MyClass {

    private String grade;
    private String classTeacher;
    @Resource
    private List<Student> student;

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getClassTeacher() {
        return classTeacher;
    }

    public void setClassTeacher(String classTeacher) {
        this.classTeacher = classTeacher;
    }

    public List<Student> getStudent() {
        return student;
    }

    public void setStudent(List<Student> student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "MyClass{" +
                "grade='" + grade + '\'' +
                ", classTeacher='" + classTeacher + '\'' +
                ", students=" + student +
                '}';
    }
}
