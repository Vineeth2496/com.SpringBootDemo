package com.SpringDemo2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.SpringDemo2.model.Student;

//@Controller
//@ResponseBody
@RestController
public class StudentController {
		//http://localhost:8765/hello
		@GetMapping("/hello")
		public String getMessage() {
			return "Hello Student";
		}
		@GetMapping("/student")
		public Student getStudent() {
			return new Student("Shivaji", "Bhosale");
		}
		
		/*
		 * POST
		 * GET
		 * PUT
		 * DELETE
		 */
		 
}
