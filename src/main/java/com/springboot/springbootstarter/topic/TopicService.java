package com.springboot.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	//create and inject an Instance of TopicRepositry
	@Autowired
	private TopicRepository topicRepository;
	
	
	private List<Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic("spring", "Spring Framework", "Discription"),
			new Topic("java", "core Java ", "Discription"),
			new Topic("javascript", "Spring Framework", "Discription")
					));
	
	// using CrudRepository pre-implemented Methods
	
	
	public List<Topic> gettAllTopics(){
		List<Topic> topics = new ArrayList<>();
		topicRepository.findAll().forEach(topics::add);
		return topics;
	}
	
	public Topic getTopic(String id ) {
		return topicRepository.findById(id).get();
	}
	
	public void addTopic(Topic topic) {
		topicRepository.save(topic);
	}
	
	public void updateTopic(Topic topic, String id) { 
		topicRepository.save(topic);
		
	}
	
	public void deleteTopic( String id) { 
		topicRepository.deleteById(id);
		
	}
}
