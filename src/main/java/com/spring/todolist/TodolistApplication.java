package com.spring.todolist;

import com.spring.todolist.model.Todo;
import com.spring.todolist.model.User;
import com.spring.todolist.repository.TodoRepository;
import com.spring.todolist.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodolistApplication implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private TodoRepository todoRepository;


	public static void main(String[] args) {
		SpringApplication.run(TodolistApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		User user = new User();
		//user.setId(1L);
		user.setPassword("---");
		user.setUsername("Kalura");

		Todo todo  = new Todo();
		//todo.setId(1L);
		todo.setContent("ani kotevet kod");

		user.getTodoList().add(todo);

		todoRepository.save(todo);
		userRepository.save(user);
	}
}
