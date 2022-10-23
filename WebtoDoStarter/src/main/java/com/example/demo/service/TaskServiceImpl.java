package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.scheduling.config.Task;

import com.example.demo.dao.TaskDao;

public class TaskServiceImpl implements TaskService {
	
	private final TaskDao dao; // 未作成

	public TaskServiceImpl(TaskDao dao) {
		this.dao = dao;
	}
	
	@Override
	public List<Task> findAll() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public Optional<Task> getTask(int id) {
		// TODO 自動生成されたメソッド・スタブ
		return Optional.empty();
	}

	@Override
	public void insert(Task task) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public void update(Task task) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public void deleteById(int id) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public List<Task> findByType(int typeId) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

}
