package com.Desafio.listatarefasapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.Desafio.listatarefasapi.entity.Task;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
}
