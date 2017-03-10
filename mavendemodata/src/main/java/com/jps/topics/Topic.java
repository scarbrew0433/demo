package com.jps.topics;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity   // this tells java that its is now using a DB
public class Topic {

	//these are now columns in the table, the rows are Topics
	@Id  // annotates that id will be the primary key in the DB
	private String id;
	private String name;
	private String description;

	public Topic() {		
	}

	public Topic(String id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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

	@Override
	public String toString() {
		return "Topic [id=" + id + ", name=" + name + ", description=" + description + "]";
	}
	
	
}
