package com.chirag.springjpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.chirag.springjpa.entity.Student;

import jakarta.transaction.Transactional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
	
	public List<Student> findByFirstName(String firstName);
	
	public List<Student> findByFirstNameContaining(String firstName);
	
	public List<Student> findByLastNameNotNull();
	
	public List<Student> findByGuardianName(String guardianName);
	
	//JPQL
	@Query("select s from Student s where s.emailId= ?1")
	Student getStudentByEmailAddressQuery(String emailId);
	
	//JPQL
	@Query("select s.firstName from Student s where s.emailId= ?1")
	String getStudentfirstnamefromemail(String emailId);
	
	//Native Sql query
	@Query(
			value="SELECT * FROM tbl_student s where s.email_id = ?1 ",
			nativeQuery = true)
	Student getStudentByEmailAddressNative(String emailId);
	
	//Named parameters
	@Query(
			value="SELECT * FROM tbl_student s where s.email_id = :emailId ",
			nativeQuery = true)
	Student getStudentByEmailAddressNativeNamedParam(@Param("emailId") String emailId);
	
	//TO modify data in database
	@Modifying
	//We can implement tranactional at service layer 
	@Transactional
	@Query(
			value="update tbl_student set first_name = ?1 where email_id= ?2",
			nativeQuery = true)
	public int updateStudentNameByEmailId(String firstName, String emailId);
	
}
