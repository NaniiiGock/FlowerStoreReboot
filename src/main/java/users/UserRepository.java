package users;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface UserRepository extends JpaRepository<MyUser, Integer> {
    Optional<MyUser> findMyUserByEmail(String email);
}
