package com.example.demo.Controller;

import java.util.List;
import java.util.Arrays;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.Demo;



@RestController
public class demoController {
	// http://localhost:8081/Course
	@GetMapping("/Course")
	public List<Demo> getAllDemo(){
		return Arrays.asList(new Demo(1,"Spring","in28"),
				new Demo(2,"React js","techanical Thapa")
				);}
	// http://localhost:8081/Course1
		@GetMapping("/Course1")
		public Demo getDemoDetails(){
			return new Demo(1,"Spring","in28");
		
	}

}
