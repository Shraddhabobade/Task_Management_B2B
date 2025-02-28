package com.tka.TaskManagement.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.tka.TaskManagement.model.Tasks;
import com.tka.TaskManagement.successresponse.SuccessResponse;

@Service
public interface TasksService {
	
	public SuccessResponse saveOrUpdateTask(Tasks tasks);
	public SuccessResponse getAllTasks();
	public SuccessResponse getPerticular(Long id);
	public SuccessResponse deleteById( Long id);


}
