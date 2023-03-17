package projectservice.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import projectservice.project.entity.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Integer> {
}
