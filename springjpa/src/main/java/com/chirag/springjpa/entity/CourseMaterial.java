package com.chirag.springjpa.entity;
import static org.junit.jupiter.api.Assertions.fail;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString(exclude = "course")
public class CourseMaterial {
	
	@Id
	@SequenceGenerator(
			name="course_material_sequence",
			sequenceName = "course_material_sequence",
			allocationSize = 1
	)
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "course_material_sequence"
	)
	private long courseMaterialId;
	private String url;
	
	//To save course material we also need to save course so we are using cascade
	@OneToOne( cascade = CascadeType.ALL, fetch = FetchType.EAGER,optional = false)
	//To reference courseId from courses into course material
	@JoinColumn(
			name="course_id",
			referencedColumnName = "courseId"
	)
	private Course course;
	
}
