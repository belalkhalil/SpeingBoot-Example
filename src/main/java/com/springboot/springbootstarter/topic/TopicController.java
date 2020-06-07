package com.springboot.springbootstarter.topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
		@Autowired
		private TopicService topicService;
		
		// handle GET Requests
		@RequestMapping("/topics")
		public List<Topic> getAllTopics() {
			return topicService.gettAllTopics();
		}

		//handle get specific Entity
		@RequestMapping("/topics/{id}")
		public Topic getTopic(@PathVariable String id) {
			return topicService.getTopic(id);
		}
		
		// handle POST requests
		@RequestMapping(method=RequestMethod.POST, value="/topics")
		public void addTopic(@RequestBody Topic topic) {
			topicService.addTopic(topic);
		}
		
		//handle PUT requests
		@RequestMapping(method=RequestMethod.PUT, value="/topics/{id}")
		public void updateTopic(@RequestBody Topic topic, @PathVariable String id) {
			topicService.updateTopic(topic, id);
		}

		//handle DELETE specific Entity
		@RequestMapping(method=RequestMethod.DELETE, value="/topics/{id}")
		public void deleteTopic(@PathVariable String id) {
			 topicService.deleteTopic(id);
		}

}


