package com.task.ServiceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.task.Repository.ProjectRepository;
import com.task.Service.ProjectService;
import com.task.db.entity.Project;

@Service
public class ProjectServiceImp implements ProjectService {

	@Autowired
	ProjectRepository projectrepository;

	@Override
	public void saveproject(Project project) {
		projectrepository.save(project);

	}

	@Override
	public void deleteproject(int id) {
		projectrepository.deleteById(id);

	}

	@Override
	public List<Project> showall() {
		List<Project> project = (List<Project>) projectrepository.findAll();
		return project;
	}

	@Override
	public Project showById(int id) {
		Project project = projectrepository.findById(id).get();
		return project;
	}

}
