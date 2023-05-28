package Vivek.Demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import Vivek.Demo.Binding.Student;
import Vivek.Demo.Servies.StudentServies;

@Controller
public class StudentController {
	@Autowired
	private StudentServies stud;

	@GetMapping("/")
	public String loadIndexPage(Model model) {
		
		
		set(model);
		return "index";
		
	}
	private void set(Model model) {
		model.addAttribute("student", new Student());
		model.addAttribute("courses",stud.getCourses());
		model.addAttribute("timing", stud.getTiming());
	}
	@PostMapping("/save")
	public String SaveStudent(Student id,Model model) {
		
		
		set(model);
		
		boolean savest = stud.savestudent(id);
		if( savest) {
		model.addAttribute("msg" , "Detail seve....");
		}
		return "index";
		
		
	
}
}