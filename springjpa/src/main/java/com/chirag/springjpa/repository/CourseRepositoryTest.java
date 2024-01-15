package com.chirag.springjpa.repository;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.chirag.springjpa.entity.Course;
import com.chirag.springjpa.entity.CourseMaterial;
import com.chirag.springjpa.entity.Student;
import com.chirag.springjpa.entity.Teacher;

@SpringBootTest
public class CourseRepositoryTest {
	
	@Autowired
	private CourseRepository courseRepository;
	
	
//	@Test
//	public void printCourses() {
//		
//		List<Course> result = courseRepository.findAll();
//		System.out.println("Courses : : " + result.toString());
//	}
	
//	@Test
//	public void saveCoursewithteacher() {
//		
//		Teacher teacher  = Teacher.builder().
//				firstName("Divya").
//				lastName("Dsouza").
//				build();
//	
//		
//		Course course = Course.builder().
//				title("OS").
//				credit(6).
//				teacher(teacher).
//				build();
//		
//		courseRepository.save(course);
//	}
	
//	@Test
//	public void findAllPagination() {
//		Pageable firstPageWithThreeRecords = PageRequest.of(0, 3);
//		Pageable secondPageWithTwoRecords = PageRequest.of(1, 2);
//		
//		List<Course> courses= courseRepository.findAll(firstPageWithThreeRecords).getContent();
//		
//		Long totalElements = courseRepository.findAll(firstPageWithThreeRecords).getTotalElements();
//		
//		int totalPages = courseRepository.findAll(firstPageWithThreeRecords).getTotalPages();
//		
//		System.out.println("Course : " + courses );
//		System.out.println("totalElements : " + totalElements );
//		System.out.println("totalPages : " + totalPages );
//	}
	
//	@Test
//	public void findAllWithSorting() {
//		Pageable sortByTitle  = PageRequest.of(0, 2, Sort.by("title").descending());
//		List<Course> course = courseRepository.findAll(sortByTitle).getContent();
//		System.out.println("courses : : " + course);
//		
//	}
//	@Test
//	public void  printFindBytitleContaining() {
//		Pageable firstPageTenRecords = PageRequest.of(0, 10);
//		
//		List<Course> course = courseRepository.findByTitleContaining("D", firstPageTenRecords).getContent();
//		System.out.println("course :: " + course);
//	}
	
	@Test
	public void saveCourseWithStudentAndTeacher() {
		Teacher teacher  = Teacher.builder().
		firstName("Allen").
		lastName("Malli").
		build();
		
		Student student= Student.builder().
				firstName("Riya").
				lastName("Patil").
				emailId("patil.riya@gmail.com").
				build();

		Course course = Course.builder().
		title("JavaScript").
		credit(5).
		teacher(teacher).
		build();
		
		course.addStudent(student);
		courseRepository.save(course);
	}

}
