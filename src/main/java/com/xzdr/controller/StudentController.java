package com.xzdr.controller;

import com.xzdr.pojo.Student;
import com.xzdr.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping("/showInfo.html")
    public String getStudentById(String id, Map<String, Object> model){
        Student student = studentService.findOne("_id", id);
        model.put("student", student);
        return "index";
    }
}
