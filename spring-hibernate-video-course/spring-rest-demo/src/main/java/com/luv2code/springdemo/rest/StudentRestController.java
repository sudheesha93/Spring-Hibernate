package com.luv2code.springdemo.rest;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luv2code.springdemo.entity.Student;

@RestController
@RequestMapping("/api")
public class StudentRestController {
	
	private List<Student> student;
	@PostConstruct
	public void loadData() {
		
		student= new ArrayList<>();
		student.add(new Student("sudhee", "musku"));
		student.add(new Student("sandeep", "alalla"));
		student.add(new Student("charan", "besta"));
		student.add(new Student("namrata", "dutta"));
		
		
	}

	@GetMapping("/students")
	public List<Student> getStudents(){
		
		return student;
			
	}
	
	@GetMapping("/students/{studentId}")
	public Student getStudent(@PathVariable int studentId){
		
		return student.get(studentId);
		
		
	}
}
