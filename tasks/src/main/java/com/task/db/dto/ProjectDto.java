package com.task.db.dto;
import java.time.LocalDate;
import com.task.db.enums.AllStatus.StatusProject;
public class ProjectDto {
	
	private int id;
	
	private String projectAbbreviation;
	
	private LocalDate startDate;
	
	private LocalDate endDate;
	
	private String name;
	
	private String description;
	
	private StatusProject statusProject;
	
	private String createdBy;
	
	private LocalDate createdDate;
	
	private String updatedBy;
	
	private LocalDate updatedDate;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProjectAbbreviation() {
		return projectAbbreviation;
	}
	public void setProjectAbbreviation(String projectAbbreviation) {
		this.projectAbbreviation = projectAbbreviation;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public StatusProject getStatusProject() {
		return statusProject;
	}
	public void setStatusProject(StatusProject statusProject) {
		this.statusProject = statusProject;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public LocalDate getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	public LocalDate getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(LocalDate updatedDate) {
		this.updatedDate = updatedDate;
	}

}
