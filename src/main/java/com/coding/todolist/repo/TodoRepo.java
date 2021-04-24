package com.coding.todolist.repo;

import com.testing.youtubetodolist.model.TodoItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepo extends JpaRepository<TodoItem , Long> {
}
