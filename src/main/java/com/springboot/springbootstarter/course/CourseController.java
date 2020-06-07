package com.springboot.springbootstarter.course;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.springbootstarter.topic.Topic;

@RestController
public class CourseController {
		@Autowired
		private CourseService courseService;
		
		// handle GET Requests
		@RequestMapping("/topics/{id}/courses")
		public List<Course> getAllTopics(@PathVariable String id) {
			return courseService.gettAllCourses(id);
		}

		//handle get specific Entity
		@RequestMapping("/topics/{topicId}/courses/{id}")
		public Course getcourse(@PathVariable String id) {
			return courseService.getCourse(id);
		}
		
		// handle POST requests
		@RequestMapping(method=RequestMethod.POST, value="/topics/{topicId}/courses")
		public void addcourse(@RequestBody Course course, @PathVariable String topicId) {
			course.setTopic(new Topic(topicId,"",""));
			courseService.addCourse(course);
		}
		
		//handle PUT requests
		@RequestMapping(method=RequestMethod.PUT, value="/topics/{topicId}/courses/{id}")
		public void updateCourse(@RequestBody Course course, @PathVariable String id, @PathVariable String topicId) {
			course.setTopic(new Topic(topicId,"",""));
			courseService.updateCourse(course);
		}

		//handle DELETE specific Entity
		@RequestMapping(method=RequestMethod.DELETE, value="/topics//{topicId}/courses/{id}")
		public void deleteCourse(@PathVariable String id) {
			courseService.deleteCourse(id);
		}

}


