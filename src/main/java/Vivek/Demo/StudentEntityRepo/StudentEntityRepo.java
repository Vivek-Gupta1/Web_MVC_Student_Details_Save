package Vivek.Demo.StudentEntityRepo;

import org.springframework.data.jpa.repository.JpaRepository;

import Vivek.Demo.Entity.StudentEntity;

public interface StudentEntityRepo extends JpaRepository<StudentEntity, Integer> {

}
