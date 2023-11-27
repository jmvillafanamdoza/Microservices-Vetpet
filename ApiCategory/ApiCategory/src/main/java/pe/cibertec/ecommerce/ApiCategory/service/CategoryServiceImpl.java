package pe.cibertec.ecommerce.ApiCategory.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.cibertec.ecommerce.ApiCategory.dao.CategoryRepository;
import pe.cibertec.ecommerce.ApiCategory.entity.Category;

@Service
public class CategoryServiceImpl 
        implements CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    @Override
    public Category findByCategorySK(String categorySK) {
      return categoryRepository.findByCategorySK(categorySK);
    }

    @Override
    public Category add(Category category) {
        return categoryRepository.save(category);
    }
    
}
