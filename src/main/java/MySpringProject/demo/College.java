package MySpringProject.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("collegeBean")
public class College {
	@Autowired
	private Principal principle;
	
	@Autowired
	@Qualifier("scienceTeacher")
	private Teacher teacher;
	
	@Value("${college.name}")
	private String collegeName;
	
	/*public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}*/

	/*
	 * public College(Principal principle) { this.principle=principle; }
	 */
	/*public void setPrinciple(Principal principle) {
		this.principle = principle;
	}*/

	public void test() {
		principle.princiInfo();
		teacher.teach();
		System.out.println("My College Name is :"+(collegeName));
		System.out.println("Getting bean through bean annotation");
	}

	

	
}
