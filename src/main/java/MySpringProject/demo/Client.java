package MySpringProject.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

//@SpringBootApplication
public class Client {

	public static void main(String[] args) {
		//SpringApplication.run(DemoApplication.class, args);
		ApplicationContext context= new AnnotationConfigApplicationContext(CollegeConfig.class);
		College college=context.getBean("collegeBean",College.class);
		System.out.println("Hey from college bean:"+college);
		college.test();
		((AbstractApplicationContext) context).close();
	}

}
