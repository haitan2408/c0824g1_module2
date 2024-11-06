package mvc.service.impl;

import mvc.entity.Student;
import mvc.repository.StudentRepository;
import mvc.service.IStudentService;
import mvc.utils.sort.ComparatorStudentById;

import java.util.List;

public class StudentService implements IStudentService {
    private static StudentRepository studentRepository = new StudentRepository();

    private static StudentService instance = new StudentService();

    private StudentService(){}

    public static StudentService getInstance(){
        return instance;
    }

    @Override
    public List<Student> getAll() {
        List<Student> students = studentRepository.getAll();

        return students;
    }

    @Override
    public List<Student> getAllSortById() {
        List<Student> students = studentRepository.getAll();
        students.sort(new ComparatorStudentById());
        return students;
    }
}
