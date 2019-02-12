package com.luv2code.jackson.json.demo;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Driver {

	public static void main(String[] args) {
		
		try {
			// craete object mapper
			ObjectMapper mapper= new ObjectMapper();
			
			
			// read JSON file and map to java POJO
			//data/sample-lite.json
			Student student=mapper.readValue(new File("data/sample-full.json"), Student.class);
			
			// print deatils of stduent
			System.out.println("deatils of student");
			System.out.println("First name "+ student.getFirstName());
			System.out.println("First name "+ student.getLastName());
			System.out.println("Object and array");
			System.out.println("City "+ student.getAddress().getCity());
			System.out.println("Languages");
			for (String temp: student.getLanguages()){
				System.out.print(temp + " ");
			}
			
			
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
;
	}

}
