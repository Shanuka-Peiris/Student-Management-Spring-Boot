package com.school.studentmanagement.controller;

import com.school.studentmanagement.dto.Student;
import com.school.studentmanagement.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
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
    @GetMapping("/")
    public ResponseEntity<List<Student>> getAll() {
        ArrayList<Student> students = studentService.getStudents();
        return new ResponseEntity<>(students, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Student> getStudent(@PathVariable int id) {
        return new ResponseEntity<>(studentService.getSpecificStudent(id), HttpStatus.OK);
    }

    // Returns the added student
    @PostMapping("/")
    public ResponseEntity<Student> addNewStudent(@RequestBody Student newStudent) {
        return new ResponseEntity<>(studentService.addNewStudent(newStudent), HttpStatus.CREATED);
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
