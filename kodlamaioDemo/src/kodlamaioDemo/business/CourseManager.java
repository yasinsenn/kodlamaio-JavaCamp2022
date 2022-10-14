package kodlamaioDemo.business;

import java.util.ArrayList;
import java.util.List;

import kodlamaioDemo.core.logging.Logger;
import kodlamaioDemo.dataAccess.CourseDao;
import kodlamaioDemo.entities.Course;

public class CourseManager {
	
	private CourseDao courseDao;
	private Logger[] loggers;
	private List<Course> courses = new ArrayList<Course>();
	
	public CourseManager(CourseDao courseDao , Logger[] loggers) {
		this.courseDao = courseDao;
		this.loggers = loggers;
	}
	
	
	
	public void add(Course course) throws Exception{
		
		if (course.getPrice() < 0) {
			throw new Exception("Kurs fiyatý 0 dan küçük olamaz");
		}else {
			for (Course newCourse : courses) {
				if (newCourse.getCourseName() == course.getCourseName()) {
					throw new Exception("Eklemek istediðiniz kurs mevcut, ayný kurs tekrar eklenemez");
				}
			}
		}
		
		
		courses.add(course);		
		courseDao.add(course);
		
		for (Logger logger : loggers) {
			logger.log(course.getCourseName());
		}
	}
	
	public void getCourses() {
		for (Course course : courses) {
			System.out.println(course.getCourseName());
		}
	}

}
