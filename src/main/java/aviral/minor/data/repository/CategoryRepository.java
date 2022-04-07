package aviral.minor.data.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import aviral.minor.data.model.Category;
public interface CategoryRepository extends JpaRepository<Category,Integer>{
    
}
