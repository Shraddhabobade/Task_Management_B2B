package com.tka.TaskManagement.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.config.Task;
import org.springframework.stereotype.Service;

import com.tka.TaskManagement.model.Tasks;
import com.tka.TaskManagement.repository.TaskRepo;
import com.tka.TaskManagement.service.TasksService;
import com.tka.TaskManagement.successresponse.SuccessResponse;

@Service
public class TaskServiceImpl implements TasksService{
	
	SuccessResponse response=new SuccessResponse();
	
	@Autowired
	TaskRepo taskRepo;

	@Override
	public SuccessResponse saveOrUpdateTask(Tasks tasks) {
		
	if(tasks.getId()!=null) {
		
		Optional<Tasks> findById=taskRepo.findById(tasks.getId());
		if(!findById.isPresent()) {
			
			response.idNotFound();
			return response;
		}
		Tasks tasks2=findById.get();
		if(tasks.getTitle()!=null) {
			
			tasks2.setTitle(tasks.getTitle());
		}
		if(tasks.getDescription()!=null) {
			
			tasks2.setDescription(tasks.getDescription());
		}
		if(tasks.getStatus()!=null) {
			
			tasks2.setStatus(tasks.getStatus());
		}
		
		Tasks updatedTasks=taskRepo.save(tasks2);
		response.recordUpdated(updatedTasks);
		return response;
	}
	Tasks saveTasks=taskRepo.save(tasks);
	response.saveTasks(saveTasks);
	return response;
	}

	@Override
	public SuccessResponse getAllTasks() {
		
		List<Tasks> findAll=taskRepo.findAll();
		if(findAll.isEmpty()) {
			
			response.recordNotFound();
			return response;
		}
		response.recordFound(findAll);
		
		return response;
	}

	@Override
	public SuccessResponse getPerticular(Long id) {
		Optional<Tasks> findById=taskRepo.findById(id);
		if(!findById.isPresent()) {
			response.idNotFound();
			return response;
			
		}
	Tasks tasks=findById.get();
	response.recordFound(tasks);
		return response;
	}

	@Override
	public SuccessResponse deleteById(Long id) {
		Optional<Tasks> findById=taskRepo.findById(id);
		if(!findById.isPresent()) {
			
			response.idNotFound();
			return response;
		}
		taskRepo.deleteById(id);
		response.recordDeleted();
		return response;
	}
	
	

}
