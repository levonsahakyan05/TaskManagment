package am.itspace.taskmanagment.repository;

import am.itspace.taskmanagment.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task,Integer> {
}
