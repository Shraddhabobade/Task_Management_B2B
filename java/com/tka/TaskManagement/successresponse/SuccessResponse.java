package com.tka.TaskManagement.successresponse;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;

public class SuccessResponse {
	
	
	private Object response;
	private Boolean status;
	private String message;
	private HttpStatusCode statusCode;
	public Object getResponse() {
		return response;
	}
	public void setResponse(Object response) {
		this.response = response;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public HttpStatusCode getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(HttpStatusCode statusCode) {
		this.statusCode = statusCode;
	}
	public void idNotFound() {
		
		this.response=null;
		this.status=false;
		this.statusCode=HttpStatus.NOT_FOUND;
		this.message=Message.idNotFound;
	}
	
	public void recordUpdated(Object obj) {
		
		this.response=obj;
		this.status=true;
		this.statusCode=HttpStatus.ACCEPTED;
		this.message=Message.recordUpdated;
	}
	public void saveTasks(Object obj) {
		
		this.response=obj;
		this.status=true;
		this.statusCode=HttpStatus.ACCEPTED;
		this.message=Message.tasksSaved;
	}
	public void recordNotFound() {
		
		this.response=null;
		this.status=false;
		this.statusCode=HttpStatus.NOT_FOUND;
		this.message=Message.recordNotFound;
	}
	public void recordFound(Object obj) {
		
		this.response=obj;
		this.status=true;
		this.statusCode=HttpStatus.FOUND;
		this.message=Message.recordFound;
	}
	public void recordDeleted() {
		
		this.response=null;
		this.status=true;
		this.statusCode=HttpStatus.OK;
		this.message=Message.recordDeleted;
	}

}
