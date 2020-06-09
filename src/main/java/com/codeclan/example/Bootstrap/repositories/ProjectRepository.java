package com.codeclan.example.Bootstrap.repositories;

import com.codeclan.example.Bootstrap.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
}
