package com.braisedpanda.shirotest.service;


import com.braisedpanda.shirotest.model.po.Student;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {

    @CacheEvict(value="student",allEntries = true,key="'addStudent:'+#student.stuId")
    void addStudent(Student student);



    List<Student> getAllStudent();
    @CacheEvict(value = "student" ,allEntries = true,key="'delete:'+#stuId")
    void delete(String stuId);

    @Cacheable(value="student" , key="'getStudentById:'+#stuId")
    Student getStudentById(String stuId);

    @CacheEvict(value="student",allEntries = true, key="'updateStudent:'+#student.stuId")
    void updateStudent(Student student);


    List<String> listClass();

    @Cacheable(value="student" ,key="'getStudentConutByCid:'+#classid")
    int getStudentConutByCid(String classid);
    //根据班级id值获取所有的学生
    @Cacheable(value="student", key="'getStduentByClassId:'+#classId")
    List<Student> getStudentByClassId(String classId);
}
