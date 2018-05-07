package com.xzdr.pojo;

import org.springframework.data.annotation.Id;

public class Grade {
    @Id
    private String _id;
    private String student_id;
    private String studentName;
    private String subject;
    private double grade;


    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getStudent_id() {
        return student_id;
    }

    public void setStudent_id(String student_id) {
        this.student_id = student_id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "_id='" + _id + '\'' +
                ", student_id='" + student_id + '\'' +
                ", studentName='" + studentName + '\'' +
                ", subject='" + subject + '\'' +
                ", grade=" + grade +
                '}';
    }
}
