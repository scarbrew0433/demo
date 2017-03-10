package com.jps.course;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// connect to the DB service

@Service
public class CourseService {

	@Autowired // when an instance TopicService is created it will inject
				// topRepository into TopicService
	private CourseRepository courseRepository;

	public List<Course> getAllCourses(String topicId) {
//embedded Derby	public List<Course> getAllCourses(String id) {
//embedded Derby		courseRepository.findAll().forEach(courses::add);  // LAMBA functionality
		List<Course> courses = new ArrayList<>();
		courseRepository.findByTopicId(topicId).forEach(courses::add);;
		return courses;
	}

	public Course getCourse(String id) {
		return courseRepository.findOne(id);
	}

	public void addCourse(Course course) {
		courseRepository.save(course); // adds to DB
	}

	public void updateCourse(Course course) {
		courseRepository.save(course); // can do an add and a UPDATE to DB
	}

	public void deleteCourse(String id) {
		courseRepository.delete(id);
	}
}
