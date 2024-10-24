package mvc.service;

import mvc.entity.Student;

import java.util.List;

public interface IPersonService<E> {

    List<E> getAll();

    List<E> getAllSortById();
}
