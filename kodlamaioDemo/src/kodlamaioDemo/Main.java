package kodlamaioDemo;

import kodlamaioDemo.business.CategoryManager;
import kodlamaioDemo.core.logging.DatabaseLogger;
import kodlamaioDemo.core.logging.FileLogger;
import kodlamaioDemo.core.logging.Logger;
import kodlamaioDemo.core.logging.SmsLogger;
import kodlamaioDemo.dataAccess.HibernateCategoryDao;
import kodlamaioDemo.entities.Category;

public class Main {

	public static void main(String[] args) {

		
		Category category1 = new Category();
		category1.setId(1);
		category1.setCategoryName("Java");
		
		Category category2= new Category();
		category2.setId(2);
		category2.setCategoryName("Java");
		
		Logger[] loggers = new Logger[] {new FileLogger(), new SmsLogger() , new DatabaseLogger()};
		
		CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), loggers);
		categoryManager.add(category1);
		
	}

}
