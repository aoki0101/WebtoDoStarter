package com.example.demo.app.task;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.service.TaskService;


//**
// ToDoアプリ
//**
@Controller
@RequestMapping("/task")
public class TaskController {
	
	private final TaskService taskService;
	
	public TaskController(TaskService taskService) {
		this.taskService = taskService;
	}
	
	
	/**
	** タスクの一覧を表示する。
	** @param taskForm
	** @param model
	** @return resource/templates下のHTMLファイル名
	*/
	@GetMapping
	public String task(TaskForm taskForm, Model model) {

		model.addAttribute("list", "");
        model.addAttribute("title", "タスク一覧");
		
		return "task/index";
	}
	
	/**
	** タスクデータを一件挿入
	** @param taskForm 
	** @param result
	** @param model
	*  @return
	*/
	@PostMapping("/insert")
	public String insert(
			@ModelAttribute TaskForm taskform,
			BindingResult result,
			Model model) {
			
		
		return null; 
	}
			
}
