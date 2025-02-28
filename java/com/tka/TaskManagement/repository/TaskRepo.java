package com.tka.TaskManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tka.TaskManagement.model.Tasks;

@Repository
public interface TaskRepo extends JpaRepository<Tasks, Long>{

}
