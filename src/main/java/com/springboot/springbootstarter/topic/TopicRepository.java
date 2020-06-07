package com.springboot.springbootstarter.topic;

import org.springframework.data.repository.CrudRepository;

// inherit CrudRepository
public interface TopicRepository extends CrudRepository<Topic,String>{
	
	
	
}
