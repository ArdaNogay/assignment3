package dataAccess;

import entities.Category;

import java.util.ArrayList;
import java.util.List;

public class JdbcCategoryDao implements CategoryDao {

    private List<Category> categories = new ArrayList<>();

    @Override
    public List<Category> add(Category category) {
        System.out.println("JDBC ile veritabanına eklendi : " + category.toString());
        categories.add(category);
        return categories;
    }

    @Override
    public List<Category> delete(Category category) {
        System.out.println("Silindi : " + category.toString());
        categories.remove(category);
        return categories;
    }
}
