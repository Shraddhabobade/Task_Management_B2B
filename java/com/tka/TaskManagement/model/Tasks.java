package com.tka.TaskManagement.model;


import com.tka.TaskManagement.Enum.TaskStatus;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Tasks {
	
	   @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String title;
	    private String description;
	    private TaskStatus status;
		public Tasks() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		public Tasks(Long id, String title, String description, TaskStatus status) {
			super();
			this.id = id;
			this.title = title;
			this.description = description;
			this.status = status;
		}
		

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public TaskStatus getStatus() {
			return status;
		}
		public void setStatus(TaskStatus status) {
			this.status = status;
		}
		@Override
		public String toString() {
			return "Tasks [id=" + id + ", title=" + title + ", description=" + description + ", status=" + status + "]";
		} 
	    
	    
	    
	    

}
