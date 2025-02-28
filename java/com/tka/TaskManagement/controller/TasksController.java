package com.tka.TaskManagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tka.TaskManagement.model.Tasks;
import com.tka.TaskManagement.service.TasksService;
import com.tka.TaskManagement.successresponse.SuccessResponse;

@RestController
@RequestMapping("/tasks")
@CrossOrigin
public class TasksController {
	
	@Autowired
	TasksService tasksService;
	
	@PostMapping("saveOrUpdateTasks")
	public SuccessResponse saveOrUpdateTask(@RequestBody Tasks tasks) {
		
		return tasksService.saveOrUpdateTask(tasks);
	}
	
	@GetMapping("getAllTask")
	public SuccessResponse getAllTasks() {
		return tasksService.getAllTasks();
		
		
	}
	@GetMapping("getPerticular/{id}")
	public SuccessResponse getPerticular(@PathVariable Long id) {
		return tasksService.getPerticular(id);
	}

	@DeleteMapping("delete/{id}")
	public SuccessResponse deleteById(@PathVariable Long id) {
		
		return tasksService.deleteById(id);
	}
}
