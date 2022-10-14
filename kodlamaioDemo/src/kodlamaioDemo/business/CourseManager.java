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
			throw new Exception("Kurs fiyat� 0 dan k���k olamaz");
		}else {
			for (Course newCourse : courses) {
				if (newCourse.getCourseName() == course.getCourseName()) {
					throw new Exception("Eklemek istedi�iniz kurs mevcut, ayn� kurs tekrar eklenemez");
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
