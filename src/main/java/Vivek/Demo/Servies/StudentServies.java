package Vivek.Demo.Servies;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Vivek.Demo.Binding.Student;
import Vivek.Demo.Entity.StudentEntity;
import Vivek.Demo.StudentEntityRepo.StudentEntityRepo;
import ch.qos.logback.core.joran.util.beans.BeanUtil;

@Service
public class StudentServies {
	@Autowired
	private StudentEntityRepo repo;
	
	
	public boolean  savestudent(Student student) {
		System.out.println(student);
		StudentEntity stude = new StudentEntity();
		BeanUtils.copyProperties(student, stude);
		stude.setTimes(Arrays.toString(student.getTimes()));
		System.out.println(stude);
		repo.save(stude);
		return true;

	}

public List<String> getCourses(){
	return Arrays.asList("java","Python","Spring","Devops");
	
}

public List<String> getTiming(){
	return Arrays.asList("Morning","AfterNoon","Evening");
}
}
