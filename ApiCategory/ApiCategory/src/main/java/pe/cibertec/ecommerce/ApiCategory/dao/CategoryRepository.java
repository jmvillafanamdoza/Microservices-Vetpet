package pe.cibertec.ecommerce.ApiCategory.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.cibertec.ecommerce.ApiCategory.entity.Category;

public interface CategoryRepository  extends JpaRepository<Category, Long>{
    
    Category findByCategorySK(String categorySK);
    
}
