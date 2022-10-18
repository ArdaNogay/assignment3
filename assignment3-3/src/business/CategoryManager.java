package business;

import core.logging.BaseLogger;
import dataAccess.CategoryDao;
import entities.Category;
import entities.Course;

import java.util.ArrayList;
import java.util.List;

public class CategoryManager {

    private List<Category> categories = new ArrayList<>();

    private CategoryDao categoryDao;
    private BaseLogger[] baseLoggers;

    public CategoryManager(CategoryDao categoryDao, BaseLogger[] baseLoggers) {
        this.categoryDao = categoryDao;
        this.baseLoggers = baseLoggers;
    }


    public List<Category> add(Category category) {
        if (controlCategoryName(category)) {
            categories = categoryDao.add(category);
            log(category, "eklendi");
        }
        return categories;
    }

    private boolean controlCategoryName(Category category) {
        for (Category _category : categories) {
            if (_category.getCategoryName().equals(category.getCategoryName())) {
                System.err.println("Bu isimde başka bir kategori mevcut!");
                return false;
            }
        }
        return true;
    }

    public List<Category> deleteById(int id) {
        for (Category category : categories) {
            if (category.getId() == id) {
                categoryDao.delete(category);
                log(category, "silindi");
            }
        }
        return categories;
    }

    private void log(Category category, String x) {
        for (BaseLogger logger : baseLoggers) {
            logger.log(category.toString() + " " + x);
        }
    }

}
