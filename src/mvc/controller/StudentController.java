package mvc.controller;

import mvc.entity.Student;
import mvc.service.IStudentService;
import mvc.service.impl.StudentService;

import java.util.List;

public class StudentController {
    private static IStudentService studentService = new StudentService();

    public List<Student> getAll() {
        List<Student> students = studentService.getAll();
        return students;
    }
}
