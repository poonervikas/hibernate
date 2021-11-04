package com.manytomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Project {

	@Id
	private int projectId;
	private String name;
	
	@ManyToMany(mappedBy = "projects")
	private List<Developer> developers;

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Developer> getDevelopers() {
		return developers;
	}

	public void setDevelopers(List<Developer> developers) {
		this.developers = developers;
	}

	public Project(int projectId, String name, List<Developer> developers) {
		super();
		this.projectId = projectId;
		this.name = name;
		this.developers = developers;
	}

	public Project() {
		// TODO Auto-generated constructor stub
	}
	
	
}
