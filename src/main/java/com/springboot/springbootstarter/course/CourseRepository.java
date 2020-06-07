package com.springboot.springbootstarter.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

// inherit CrudRepository
public interface CourseRepository extends CrudRepository<Course,String>{
	
	//Method to select courses based on a given Topic
	public List<Course> findByTopicId(String topicId);
		
		
	
}
