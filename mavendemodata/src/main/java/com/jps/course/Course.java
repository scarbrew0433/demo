package com.jps.course;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.jps.topics.Topic;

@Entity   // this tells java that its is now using a DB
public class Course {

	//these are now columns in the table, the rows are Topics
	@Id  // annotates that id will be the primary key in the DB
	private String id;
	private String name;
	private String description;

	@ManyToOne
	private Topic topic; //ties the course to a singular Topic
	
	public Course() {		
	}

	public Course(String id, String name, String description, String topicId) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		
		this.topic = new Topic(topicId, "", "");
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

	public Topic getTopic() {
		return topic;
	}

	public void setTopic(Topic topic) {
		this.topic = topic;
	}
	
	
}
