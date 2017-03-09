package com.jps.topics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	private List<Topic> topics = new ArrayList<> (Arrays.asList(
			new Topic("spring", "Spring FrameW", "Spring FrameWork Desc"),
			new Topic("java", "Core Java", "Core Java Desc"),
			new Topic("javaScript", "Java Script ", "JavaScript Desc")	
			));
	public List<Topic> getAllTopics() {
		return topics;
	}
	
	public Topic getTopic(String id) {
		return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
	}

	public void addTopic(Topic topic) {
		topics.add(topic);
		
	}

	public void updateTopic(String id,Topic topic) {
		for (int i =0; i< topics.size(); i++) {
			Topic t = topics.get(i);
			if (t.getId().equals(id)) {
				topics.set(i,topic);
				return;
			}
		}
		
	}

	public void deleteTopic(String id) {
//		topics.removeIf(t -> t.getId().equals(id));
		
		for (int i =0; i< topics.size(); i++) {
			Topic t = topics.get(i);
			if (t.getId().equals(id)) {
				topics.remove(i);
				return;
			}
		}
		
	}
}
