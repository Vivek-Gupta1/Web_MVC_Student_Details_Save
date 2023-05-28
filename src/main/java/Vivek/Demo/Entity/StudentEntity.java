package Vivek.Demo.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="Student_Inquery")
public class StudentEntity {
 @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer sid;
	private String name;
	private String Email;
	private String Gender;
	private String course;
	private  String times;

}
