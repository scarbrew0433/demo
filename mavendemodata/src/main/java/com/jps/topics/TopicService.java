package com.jps.topics;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// connect to the DB service

@Service
public class TopicService {

	@Autowired // when an instance TopicService is created it will inject
				// topRepository into TopicService
	private TopicRepository topicRepository;

	public List<Topic> getAllTopics() {
		List<Topic> topics = new ArrayList<>();
		topicRepository.findAll().forEach(topics::add);  // LAMBA functionality
		return topics;
	}

	public Topic getTopic(String id) {
		return topicRepository.findOne(id);
	}

	public void addTopic(Topic topic) {
		topicRepository.save(topic); // adds to DB
	}

	public void updateTopic(String id, Topic topic) {
		topicRepository.save(topic); // can do an add and a UPDATE to DB
	}

	public void deleteTopic(String id) {
		topicRepository.delete(id);
	}
}
