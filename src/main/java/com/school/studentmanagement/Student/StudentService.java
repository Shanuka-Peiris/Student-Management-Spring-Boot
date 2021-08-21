package com.school.studentmanagement.Student;

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

        return studentArrayList.get(studentArrayList.size()-1);
    }

    public Student updateStudent(Student student) {
        try {
            studentArrayList.set((int) student.getId() - 1, student);

        }catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
        }

        return studentArrayList.get((int) student.getId() - 1);
    }

    public void removeStudent(long id) {
        studentArrayList.remove(studentArrayList.get((int) id-1));
    }
}
