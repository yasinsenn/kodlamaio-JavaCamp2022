package kodlamaioDemo;

import kodlamaioDemo.business.CategoryManager;
import kodlamaioDemo.business.CourseManager;
import kodlamaioDemo.core.logging.DatabaseLogger;
import kodlamaioDemo.core.logging.FileLogger;
import kodlamaioDemo.core.logging.Logger;
import kodlamaioDemo.core.logging.SmsLogger;
import kodlamaioDemo.dataAccess.HibernateCategoryDao;
import kodlamaioDemo.dataAccess.JdbcCourseDao;
import kodlamaioDemo.entities.Category;
import kodlamaioDemo.entities.Course;

public class Main {

	public static void main(String[] args) throws Exception {

		Category category1 = new Category();
		category1.setId(1);
		category1.setCategoryName("Yazýlým");

		Category category2 = new Category(2, "Yazýlým");

		Course course1 = new Course(1, "Java", "Back-End", "Engin Demiroð", 89.99);
		Course course2 = new Course(2, "Python", "Back-End", "Engin Demiroð" , 0);
		Course course3 = new Course(3, "Java", "Spring Boot", "Engin Demiroð", 50);
		
		

		Logger[] loggers = new Logger[] { new FileLogger(), new SmsLogger(), new DatabaseLogger() };

		CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), loggers);
		categoryManager.add(category1);
		//categoryManager.add(category2);
		categoryManager.getCategory();
		
		CourseManager courseManager = new CourseManager(new JdbcCourseDao(), loggers);
		courseManager.add(course1);
		courseManager.add(course2);
		courseManager.add(course3);
	}

}
