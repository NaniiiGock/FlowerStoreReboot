package users;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public List<MyUser> getUsers() {
        return userRepository.findAll();
    }
    public void addUsers(MyUser user) {
        if (userRepository.findMyUserByEmail(user.getEmail()).isEmpty()) {
            userRepository.save(user);
        }
    }
}
