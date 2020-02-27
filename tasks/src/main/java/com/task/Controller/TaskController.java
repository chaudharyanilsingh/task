package com.task.Controller;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.task.Service.TaskService;
import com.task.db.dto.TaskDto;
import com.task.db.entity.Task;
import com.task.common.Response; 

@RestController 
@RequestMapping(value="task")
public class TaskController 
{
	@Autowired
	private TaskService taskService;
	
	ModelMapper modelMapper = new ModelMapper();
	
	@PostMapping
	public ResponseEntity<Response> addtask(@RequestBody TaskDto taskdto)
	{
		Task task = modelMapper.map(taskdto, Task.class);
		
		return new ResponseEntity<>(new Response("ok").setResult(taskService.saveTask(task)),HttpStatus.OK);
	}

	@PutMapping
	public ResponseEntity<String>  updatetask(@RequestBody TaskDto taskdto)
	{
		             //Task task1=taskService.showById(task.getTicketNumber()).get();
		
		Task task=modelMapper.map(taskdto,Task.class);
		taskService.upadateTask(task);
		return new ResponseEntity<>("update ok ",HttpStatus.OK);
	}
	@DeleteMapping(value="{id}")
	public String deletatask(@PathVariable(value="id") int id)
	{
		
		taskService.deletetask(id);
		return "data of id  "+id+"  deleted";
	}
	@GetMapping
	public List<TaskDto> showall()
	{
		Type listType = new TypeToken<List<TaskDto>>() {}.getType();
		List<Task> task=(List<Task>) taskService.showall();
		List<TaskDto> tasks = new ModelMapper().map(task, listType);
		return tasks;
		
	}
	@GetMapping(value="{id}")
	public TaskDto showtaskbyid(@PathVariable(value="id") int id)
	{
		Optional<Task> task=taskService.showById(id);
		TaskDto taskdto=modelMapper.map(task.orElse(new Task()),TaskDto.class);
		return taskdto;
		
	}
}
