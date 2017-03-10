package com.jps.topics;

import org.springframework.data.repository.CrudRepository;

//this will hold the code that uses JPA to do the work
public interface TopicRepository extends CrudRepository<Topic,String> {

	
	
	
}
