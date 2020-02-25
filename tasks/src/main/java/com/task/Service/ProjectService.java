package com.task.Service;
import java.util.List;
import com.task.db.entity.Project;
public interface ProjectService {

	void saveproject(Project project);

	void deleteproject(int id);

	List<Project> showall();

	Project showById(int id);

}
