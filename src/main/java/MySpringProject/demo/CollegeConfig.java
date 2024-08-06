package MySpringProject.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@Configuration
@ComponentScan(basePackages = "MySpringProject.demo")
@PropertySource("classpath:application.properties")
public class CollegeConfig {
	/*
	 * @Bean public Teacher mathTeacher() { return new MathTeacher(); }
	 * 
	 * @Bean public Principal principalBean() { return new Principal(); }
	 * 
	 * @Bean public College collegeBean() { College college=new College();
	 * college.setPrinciple(principalBean()); college.setTeacher(mathTeacher());
	 * return college; }
	 */
	
}
