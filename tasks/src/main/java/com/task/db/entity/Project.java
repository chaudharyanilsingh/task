package com.task.db.entity;
import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import com.task.db.enums.AllStatus.StatusProject;
@Entity
public class Project extends Basetimes {
	@Id
	private int id;
	
	private String projectAbbreviation;
	
	private LocalDate startDate;
	
	private LocalDate endDate;
	
	private String name;
	
	private String description;
	
	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private StatusProject statusProject;

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

	public Project(int id, String projectAbbreviation, LocalDate startDate, LocalDate endDate, String name,
			String description, StatusProject statusProject) {
		super();
		this.id = id;
		this.projectAbbreviation = projectAbbreviation;
		this.startDate = startDate;
		this.endDate = endDate;
		this.name = name;
		this.description = description;
		this.statusProject = statusProject;
	}

	public Project() {
		super();
	}

	@Override
	public String toString() {
		return "Project [id=" + id + ", projectAbbreviation=" + projectAbbreviation + ", startDate=" + startDate
				+ ", endDate=" + endDate + ", name=" + name + ", description=" + description + ", statusProject="
				+ statusProject + "]";
	}

}
