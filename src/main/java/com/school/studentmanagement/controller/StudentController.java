package com.school.studentmanagement.controller;

import com.school.studentmanagement.dto.Student;
import com.school.studentmanagement.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/student")
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    // Returns all saved students
    @GetMapping("/all")
    public List<Student> getAll() {
        return studentService.getStudents();
    }

    // Returns the added student
    @PostMapping
    public Student addNewStudent(@RequestBody Student newStudent) {
        return studentService.addNewStudent(newStudent);
    }

    // Returns the updated student record
    @PutMapping("/{id}")
    public Student updateStudent(@RequestBody Student updateStudent, @PathVariable int id) {
        return studentService.updateStudent(updateStudent, id);
    }

    // removes a student record
    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable int id) {
        studentService.removeStudent(id);
    }
}
