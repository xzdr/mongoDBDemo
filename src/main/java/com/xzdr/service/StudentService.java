package com.xzdr.service;

import com.xzdr.dao.StudentDao;
import com.xzdr.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentDao studentDao;

    public Student findOne(String fieldName, Object value){
        return (Student) studentDao.findOne(fieldName, value, Student.class);
    }

    public List<Student> findRegex(String fieldName, String value){
        return (List<Student>) studentDao.findRegex(fieldName, value, Student.class);
    }

    public List<Student> findAll(){
        return (List<Student>) studentDao.findAll(Student.class);
    }

    public void insert(Student student){
        studentDao.insert(student);
    }

    public void remove(String id){
        studentDao.remove(id, Student.class);
    }
}
