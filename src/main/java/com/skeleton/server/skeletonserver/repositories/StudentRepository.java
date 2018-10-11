package com.skeleton.server.skeletonserver.repositories;

import com.skeleton.server.skeletonserver.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {
    List<Student> findAll();
}
