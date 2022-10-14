package kodlamaioDemo.business;

import java.util.ArrayList;
import java.util.List;

import kodlamaioDemo.core.logging.Logger;
import kodlamaioDemo.dataAccess.CategoryDao;
import kodlamaioDemo.entities.Category;

public class CategoryManager {

	private CategoryDao categoryDao;
	private Logger[] loggers;
	private List<Category> categories = new ArrayList<Category>();

	public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;
	}

	public void add(Category category) throws Exception {

		for (Category newCategory : categories) {
			if (newCategory.getCategoryName() == category.getCategoryName()) {
				throw new Exception("Eklemek istediðiniz kategori mevcut, ayný kategori tekrar eklenemez");
			}
		}

		categories.add(category);
		categoryDao.add(category);
		for (Logger logger : loggers) {
			logger.log(category.getCategoryName());
		}

	}

	public void getCategory() {

		for (Category getcategory : categories) {
			System.out.println(getcategory.getCategoryName());
		}
	}

}
