package com.chirag.springjpa.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Table(name="tbl_student", 
		uniqueConstraints = @UniqueConstraint(
		name="emailId_unique",
		columnNames = "emailId"
		)
	)
public class Student {
	
	@Id
	@SequenceGenerator(name="student_sequence",
		sequenceName="student_sequence",
		allocationSize = 1
	)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, 
		generator = "student_sequence"
	)
	private Long studentId;
	private String firstName;
	private String lastName;
	
	@Column(name="emailId" ,nullable = false)
	private String emailId;
	
	//Embeds guardian class in student class
	//Doesn't create a new table for guardian 
	@Embedded
	private Guardian guardian;
	
	
	
	
	
	
			
	
}
