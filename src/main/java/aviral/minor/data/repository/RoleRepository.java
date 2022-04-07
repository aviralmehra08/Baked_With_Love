package aviral.minor.data.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import aviral.minor.data.model.Role;
public interface RoleRepository extends JpaRepository<Role,Integer>{
    
}

