package pe.cibertec.ecommerce.ApiCategory.service;

import java.util.List;
import pe.cibertec.ecommerce.ApiCategory.entity.Category;


public interface CategoryService {
    List<Category> findAll();
    Category findByCategorySK(String categorySK);
    Category add(Category category);
}
