package com.school.studentmanagement.services;

import com.school.studentmanagement.dto.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class StudentService {

    ArrayList<Student> studentArrayList = new ArrayList<>();

    public ArrayList<Student> getStudents () {

        return studentArrayList;
    }

    public Student addNewStudent(Student student) {
        studentArrayList.add(student);

        System.out.println(studentArrayList);
        return studentArrayList.get(studentArrayList.size()-1);

    }

    public Student updateStudent(Student student, int id) {
        try {
            studentArrayList.set(id-1, student);

        }catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
        }

        return studentArrayList.get(id-1);
    }

    public void removeStudent(long id) {
        studentArrayList.remove(studentArrayList.get((int) id-1));
    }
}
