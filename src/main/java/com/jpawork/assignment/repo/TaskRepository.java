package com.jpawork.assignment.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jpawork.assignment.entities.Task;

	@Repository
	public interface TaskRepository extends JpaRepository<Task, Long> {
	}


