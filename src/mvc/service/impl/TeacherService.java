package mvc.service.impl;

import mvc.entity.Teacher;
import mvc.service.ITeacherService;

import java.util.List;

public class TeacherService implements ITeacherService {
    @Override
    public List<Teacher> getAll() {
        return List.of();
    }

    @Override
    public List<Teacher> getAllSortById() {
        return List.of();
    }
}
