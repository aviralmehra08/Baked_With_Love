package aviral.minor.data.service;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import aviral.minor.data.model.Category;
import aviral.minor.data.repository.CategoryRepository;
@Service
public class CategoryService {
        
    @Autowired
    CategoryRepository categoryrepository;

    public void addCategory(Category category)
    {
        categoryrepository.save(category);
    }

    public List<Category> getAllCategory()
    {
        return categoryrepository.findAll();
    }

    public void removeCategoryById(int id)
    {
        categoryrepository.deleteById(id);
    }

    public Optional<Category> getCategoryById(int id)
    {
        return categoryrepository.findById(id);
    }
}

