package com.chirag.springjpa.repository;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.chirag.springjpa.entity.Course;
import com.chirag.springjpa.entity.Teacher;

@SpringBootTest
public class TeacherRepositoryTest {
	
	@Autowired
	private TeacherRepository teacherRepository;
	
//	@Test
//	public void saveTeacher() {
//		Course course = Course.builder().
//				title("Maths").
//				credit(6).
//				build();
//		Teacher teacher = Teacher.builder().firstName("Mayur").lastName("Sir").courses(List.of(course)).build();
//		teacherRepository.save(teacher);
	//}

}
