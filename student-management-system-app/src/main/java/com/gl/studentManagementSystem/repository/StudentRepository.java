package com.gl.studentManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gl.studentManagementSystem.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
