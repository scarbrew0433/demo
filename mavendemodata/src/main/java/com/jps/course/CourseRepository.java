package com.jps.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

//this will hold the code that uses JPA to do the work
// define methods that you would want to use that isn't part of
// the CrudRepository
public interface CourseRepository extends CrudRepository<Course,String> {

	public List<Course> findByName(String name);
	public List<Course> findByDescription(String foo);
	
	public List<Course> findByTopicId(String topicId);
}
