package aviral.minor.data.repository;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import aviral.minor.data.model.User;
public interface UserRepository extends JpaRepository<User, Integer>
{
    Optional <User> findUserByEmail(String email);
}