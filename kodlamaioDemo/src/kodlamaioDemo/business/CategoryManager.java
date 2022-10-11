package kodlamaioDemo.business;


import java.util.ArrayList;
import java.util.List;

import kodlamaioDemo.core.logging.Logger;
import kodlamaioDemo.dataAccess.CategoryDao;
import kodlamaioDemo.entities.Category;

public class CategoryManager {
	
	private CategoryDao categoryDao;
	private Logger[] loggers;
	//List<Category> categories = new ArrayList<Category>();
	
	public CategoryManager(CategoryDao categoryDao , Logger[] loggers) {
		this.categoryDao =categoryDao;
		this.loggers = loggers;
	}
	
	public void add(Category category) {
		
	
	
		categoryDao.add(category);
		
		for (Logger logger : loggers) {
			logger.log(category.getCategoryName());
		}
		
	}
	


}
