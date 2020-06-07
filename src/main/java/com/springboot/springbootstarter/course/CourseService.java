package com.springboot.springbootstarter.course;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	//create and inject an Instance of TopicRepositry
	@Autowired
	private CourseRepository courseRepository;
	
	
	// using CrudRepository pre-implemented Methods
	
	
	public List<Course> gettAllCourses(String topicId){
		List<Course> courses = new ArrayList<>();
		courseRepository.findByTopicId(topicId).forEach(courses::add);
		return courses;
	}
	
	public Course getCourse(String id ) {
		return courseRepository.findById(id).get();
	}
	
	public void addCourse(Course course) {
		courseRepository.save(course);
	}
	
	public void updateCourse(Course topic) { 
		courseRepository.save(topic);
		
	}
	
	public void deleteCourse( String id) { 
		courseRepository.deleteById(id);
		
	}
}
