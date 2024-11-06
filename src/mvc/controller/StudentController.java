package mvc.controller;

import mvc.entity.Student;
import mvc.service.IPersonService;
import mvc.service.IStudentService;
import mvc.service.ServiceFactory;
import mvc.service.impl.StudentService;
import mvc.utils.enum_demo.ServiceEnum;

import java.util.List;

public class StudentController {
//    DI nguyên lý D trong SOLID
    private static IPersonService studentService = ServiceFactory.getInstance(ServiceEnum.STUDENT);

    public List<Student> getAll() {
        List<Student> students = studentService.getAll();
        return students;
    }

    public List<Student> displayAllStudentSortById() {
        return studentService.getAllSortById();
    }
}
