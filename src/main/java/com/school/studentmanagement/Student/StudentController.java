package com.school.studentmanagement.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    @GetMapping("/get/all")
    public List<Student> getAll() {
        return studentService.getStudents();
    }

    // Returns the added student
    @GetMapping("/create/new")
    public Student addNewStudent() {
        Student student = new Student(
                1L,
                "Shanuka",
                "Peiris",
                21,
                "2000/09/15",
                "200025902423",
                12,
                "0710563822",
                "borella, Sri lanka",
                "Male"
        );

        return studentService.addNewStudent(student);
    }

    // Returns the updated student record
    @GetMapping("/update")
    public Student updateStudent() {
        Student student = new Student(
                1L,
                "test",
                "123",
                11,
                "2000/09/15",
                "200025912423",
                13,
                "0710563824",
                "nugegoda, Sri lanka",
                "female"
        );

        return studentService.updateStudent(student);
    }

    // removes a student record
    @GetMapping("/remove")
    public void deleteStudent() {
        long id = 1L;

        studentService.removeStudent(id);
    }
}
