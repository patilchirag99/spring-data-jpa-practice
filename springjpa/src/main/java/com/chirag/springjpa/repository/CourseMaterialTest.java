package com.chirag.springjpa.repository;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.chirag.springjpa.entity.Course;
import com.chirag.springjpa.entity.CourseMaterial;

@SpringBootTest
public class CourseMaterialTest {
	
	@Autowired
	private CourseMaterialRepository courseMaterialRepository;
	
//	@Test
//	public void saveCourseMaterial() {
//		
//		Course course = Course.builder().title("DSA").credit(6).build();
//		
//		CourseMaterial material = CourseMaterial.builder().url("www.google.com").course(course).build();
//		
//		courseMaterialRepository.save(material);
//	}
//	
	
	@Test
	public void printAllCourseMaterial() {
		
		
		List<CourseMaterial> material = courseMaterialRepository.findAll();
		
		System.out.println("All course material : " + material.toString());
	}
	
	
}
