package com.task.Controller;

import java.lang.reflect.Type;
import java.util.List;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.task.Service.ProjectService;
import com.task.db.dto.ProjectDto;
import com.task.db.entity.Project;

@RestController 
@RequestMapping(value="project")
public class ProjectController {
	
	@Autowired
	private ProjectService projectservice;

	ModelMapper modelMapper = new ModelMapper();
	
	@PostMapping
	public String addproject(@RequestBody ProjectDto projectdto)
	{

		Project project=modelMapper.map(projectdto,Project.class);
		projectservice.saveproject(project);
		return "data saved";
	}

	@PutMapping
	public String  updateproject(@RequestBody ProjectDto projectdto)
	{

		Project project=modelMapper.map(projectdto,Project.class);
		projectservice.saveproject(project);
		return "data updated";
	}
	@DeleteMapping(value="{id}")
	public String deleteproject(@PathVariable(value="id") int id)
	{
		
		projectservice.deleteproject(id);
		return "data of id  "+id+"  deleted";
	}
	@GetMapping
	public List<ProjectDto> showall()
	{
		Type listType = new TypeToken<List<ProjectDto>>() {}.getType();
		List<Project> project =(List<Project>) projectservice.showall();
		List<ProjectDto> projects=new ModelMapper().map(project,listType);

		return projects;
		
	}
	@GetMapping(value="{id}")
	public ProjectDto showtaskbyid(@PathVariable(value="id") int id)
	{
		Project project=projectservice.showById(id);
		ProjectDto projectdto=modelMapper.map(project,ProjectDto.class);
	
		return projectdto;
		
	}
}
