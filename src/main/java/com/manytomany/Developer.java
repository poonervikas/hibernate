package com.manytomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Developer {

	@Id
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}

	public Developer(String name, int age, List<Project> projects) {
		super();
		this.name = name;
		this.age = age;
		this.projects = projects;
	}

	public Developer() {
		// TODO Auto-generated constructor stub
	}

	@ManyToMany
	@JoinTable(name="dev_prj",
			joinColumns = {@JoinColumn(name="devId")},
			inverseJoinColumns = {@JoinColumn(name ="prjId" )})
	private List<Project> projects;
}
