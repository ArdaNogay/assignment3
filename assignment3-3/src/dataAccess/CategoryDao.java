package dataAccess;

import entities.Category;
import java.util.List;

public interface CategoryDao {

    List<Category> add(Category category);
    List<Category> delete(Category category);

}
