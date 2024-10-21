package mvc.service.impl;

import mvc.entity.Student;
import mvc.repository.StudentRepository;
import mvc.service.IStudentService;

import java.util.List;

public class StudentService implements IStudentService {
    private static StudentRepository studentRepository = new StudentRepository();
    @Override
    public List<Student> getAll() {
        List<Student> students = studentRepository.getAll();

        return students;
    }
}
