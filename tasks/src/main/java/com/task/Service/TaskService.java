package com.task.Service;

import java.util.List;
import java.util.Optional;

import com.task.db.entity.Task;

public interface TaskService extends Iservice<Task> {

	

	Iterable<Task> showall();

	Optional<Task> showById(int id);


}
