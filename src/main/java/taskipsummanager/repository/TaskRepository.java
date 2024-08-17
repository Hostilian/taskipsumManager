package taskipsummanager.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import taskipsummanager.domain.Task;

/**
 * Spring Data MongoDB reactive repository for the Task entity.
 */
@SuppressWarnings("unused")
@Repository
public interface TaskRepository extends ReactiveMongoRepository<Task, String> {}
