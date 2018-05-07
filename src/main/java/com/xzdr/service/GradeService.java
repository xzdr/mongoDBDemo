package com.xzdr.service;

import com.xzdr.dao.GradeDao;
import com.xzdr.pojo.Grade;
import com.xzdr.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GradeService {
    @Autowired
    private GradeDao gradeDao;
    @Autowired
    private StudentService studentService;

    public void insert(Grade grade){
        gradeDao.insert(grade);
    }

    public Grade findOne(String fieldName, Object value, Class clazz){
        return (Grade) gradeDao.findOne(fieldName, value, clazz);
    }

    public List<Grade> getStudentGradeByName(String name){
        List<Grade> result = new ArrayList<Grade>();
        List<Student> students = studentService.findRegex("name", name);
        if (students != null){
            for(Student stu : students){
                Grade grade = (Grade) gradeDao.findOne("student_id", stu.get_id(), Grade.class);
                grade.setStudentName(stu.getName());
                result.add(grade);
            }
        }
        return result;
    }
}
