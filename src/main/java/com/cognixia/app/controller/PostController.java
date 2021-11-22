package com.cognixia.app.controller;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognixia.app.model.Post;


@RestController
@RequestMapping("/api/posts")
@CrossOrigin("*")
public class PostController {
	
	Date date = new Date();  
	//idNumber, userName, imageUrl, message, createdDate
	
	
	Post post1 = new Post(1, "Jeff", "http://www.something.com/image.jpg", "this is a new message", date );
	Post post2 = new Post(2, "Ana", "http://www.something.com/image.jpg", "this is a new message", date );
	Post post3 = new Post(3, "Scott", "http://www.something.com/image.jpg", "this is a new message", date );
	Post post4 = new Post(4, "Dave", "http://www.something.com/image.jpg", "this is a new message", date );
	Post post5 = new Post(5, "Lakshmi", "http://www.something.com/image.jpg", "this is a new message", date );
	Post post6 = new Post(6, "Nelson", "http://www.something.com/image.jpg", "this is a new message", date );
	Post post7 = new Post(7, "Gary", "http://www.something.com/image.jpg", "this is a new message", date );
	Post post8 = new Post(8, "Shaye", "http://www.something.com/image.jpg", "this is a new message", date );
	
	
	
	private static final Logger logger = LoggerFactory.getLogger(PostController.class);

//	//Get all posts
//	@GetMapping()
//	public List<Post> getAllPosts() {
//		List<Post> posts = new ArrayList<Post>();
//		posts.add(post1);
//		posts.add(post2);
//		posts.add(post3);
//		posts.add(post4);
//		posts.add(post5);
//		posts.add(post6);
//		posts.add(post7);
//		posts.add(post8);
//		logger.info("Get all posts called");
//		return posts;
//		return "{\"content\":[{\"id\":9,\"message\":\"At the movies after 18 months\",\"imageUrl\":\"https://th.bing.com/th/id/OIP.4amGVTJ0JNUe_mLS3JmUnQHaD5?w=340&h=180&c=7&o=5&pid=1.7\",\"createdBy\":\"Sophie\",\"createdOn\":\"2021-01-06T00:00:00.000+00:00\",\"likes\":null},{\"id\":8,\"message\":\"At home with my dog\",\"imageUrl\":\"https://th.bing.com/th/id/OIP.qXk54ZBEgZhNW3iQrCEB0gHaGN?w=202&h=180&c=7&o=5&pid=1.7\",\"createdBy\":\"Sophia\",\"createdOn\":\"2020-08-08T00:00:00.000+00:00\",\"likes\":null},{\"id\":7,\"message\":\"At home with my cat\",\"imageUrl\":\"https://th.bing.com/th/id/OIP.oFzvx1O42uyS9Zl3TBtBTwHaE7?w=294&h=196&c=7&o=5&pid=1.7\",\"createdBy\":\"Jon\",\"createdOn\":\"2020-07-07T00:00:00.000+00:00\",\"likes\":null},{\"id\":6,\"message\":\"My last meal\",\"imageUrl\":\"https://th.bing.com/th/id/OIP.NfZS25lhW_pr5T2FnBDLkwHaFk?w=223&h=180&c=7&o=5&pid=1.7\",\"createdBy\":\"John\",\"createdOn\":\"2020-04-12T00:00:00.000+00:00\",\"likes\":null},{\"id\":5,\"message\":\"My first concert\",\"imageUrl\":\"https://th.bing.com/th/id/OIP.1_ey9ZdbXudlZ4AA3m1cAwHaE7?w=236&h=180&c=7&o=5&pid=1.7\",\"createdBy\":\"Brittany\",\"createdOn\":\"2019-03-03T00:00:00.000+00:00\",\"likes\":null}],\"last\":false,\"totalElements\":13}"
//	}
	
	//Get all posts
		@GetMapping()
		public String getAllPosts() {
			
			return "{\"content\":[{\"id\":9,\"message\":\"At the movies after 18 months\",\"imageUrl\":\"https://th.bing.com/th/id/OIP.4amGVTJ0JNUe_mLS3JmUnQHaD5?w=340&h=180&c=7&o=5&pid=1.7\",\"createdBy\":\"Sophie\",\"createdOn\":\"2021-01-06T00:00:00.000+00:00\",\"likes\":null},{\"id\":8,\"message\":\"At home with my dog\",\"imageUrl\":\"https://th.bing.com/th/id/OIP.qXk54ZBEgZhNW3iQrCEB0gHaGN?w=202&h=180&c=7&o=5&pid=1.7\",\"createdBy\":\"Sophia\",\"createdOn\":\"2020-08-08T00:00:00.000+00:00\",\"likes\":null},{\"id\":7,\"message\":\"At home with my cat\",\"imageUrl\":\"https://th.bing.com/th/id/OIP.oFzvx1O42uyS9Zl3TBtBTwHaE7?w=294&h=196&c=7&o=5&pid=1.7\",\"createdBy\":\"Jon\",\"createdOn\":\"2020-07-07T00:00:00.000+00:00\",\"likes\":null},{\"id\":6,\"message\":\"My last meal\",\"imageUrl\":\"https://th.bing.com/th/id/OIP.NfZS25lhW_pr5T2FnBDLkwHaFk?w=223&h=180&c=7&o=5&pid=1.7\",\"createdBy\":\"John\",\"createdOn\":\"2020-04-12T00:00:00.000+00:00\",\"likes\":null},{\"id\":5,\"message\":\"My first concert\",\"imageUrl\":\"https://th.bing.com/th/id/OIP.1_ey9ZdbXudlZ4AA3m1cAwHaE7?w=236&h=180&c=7&o=5&pid=1.7\",\"createdBy\":\"Brittany\",\"createdOn\":\"2019-03-03T00:00:00.000+00:00\",\"likes\":null}],\"last\":false,\"totalElements\":13}";
		}
	
}

