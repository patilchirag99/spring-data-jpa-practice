package com.chirag.springjpa.repository;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import com.chirag.springjpa.entity.Guardian;
import com.chirag.springjpa.entity.Student;

@SpringBootTest
//@DataJpaTest if we use this database will not be impacted and data will be flushed out
public class StudentRepositoryTest {
	
	@Autowired
	private StudentRepository studentRepository;
	
//	@Test
//	public void saveStudent() {
//		Student student = Student.builder().emailId("chirag5@gmail.com"). 
//				firstName("Chirag").
//				lastName("Patil")
//				.build();
//		studentRepository.save(student);
//		
//	}
//	
//	@Test
//	public void  saveStudentWithGuardian() {
//		
//		Guardian guardian = Guardian.builder().name("abc_guard").mobile("9999999998").email("abcguard@gmail.com").build();
//		
//		Student student = Student.builder().
//				firstName("abc").
//				lastName("xyz").s
//				emailId("abc1@gmail.com").
//				guardian(guardian).
//				build();
//		studentRepository.save(student);
//	}
//	
//	@Test
//	public void printAll() {
//		List<Student> result = studentRepository.findAll();
//		System.out.println(result);
//	}
	
//	@Test
//	public void printStudentByFirstName() {
//		List<Student> result = studentRepository.findByFirstName("Chirag");
//		System.out.println("Chirag : " + result);
//		
//	}
//	
//	@Test
//	public void printStudentByFirstNameContaining() {
//		List<Student> result = studentRepository.findByFirstNameContaining("Ch");
//		System.out.println("Chirag containing: " + result);
//		
//	}
//	@Test
//	public void printStudentByGName() {
//		List<Student> result = studentRepository.findByGuardianName("abc_guard");
//		System.out.println("Chirag containing guards: " + result);
//		
//	}
	
//	@Test
//	public void getStudentByEmailAddressQuery() {
//		String result = studentRepository.getStudentfirstnamefromemail("chirag@gmail.com");
//		System.out.println("Chirag containing guards: " + result.toString());
//		
//	}
	
//	@Test
//	public void getStudentByEmailAddressQuery() {
//		Student result = studentRepository.getStudentByEmailAddressNative("chirag@gmail.com");
//		System.out.println("Chirag containing guards: " + result.toString());
//		
//	}
	
//	@Test
//	public void getStudentByEmailAddressQuery() {
//		Student result = studentRepository.getStudentByEmailAddressNativeNamedParam("chirag@gmail.com");
//		System.out.println("Chirag containing guards: " + result.toString());
//		
//	}
	@Test
	public void updateStudent() {
		int result = studentRepository.updateStudentNameByEmailId("chiragupdated","chirag@gmail.com");
		System.out.println("Chirag containing guards: " + result);
		
	}
}
