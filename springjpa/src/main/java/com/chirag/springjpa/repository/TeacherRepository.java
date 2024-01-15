package com.chirag.springjpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chirag.springjpa.entity.Teacher;

public interface TeacherRepository  extends JpaRepository<Teacher, Long>{

}
