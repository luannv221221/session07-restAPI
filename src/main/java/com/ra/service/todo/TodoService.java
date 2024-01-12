package com.ra.service.todo;

import com.ra.model.entity.Todo;

import java.util.List;

public interface TodoService {
    List<Todo> getAll();
    Todo save(Todo todo);
    Todo findById(Long id);
    void delete(Long id);
}
