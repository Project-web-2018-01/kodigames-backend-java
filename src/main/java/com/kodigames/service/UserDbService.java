package java.com.kodigames.service;

import java.com.kodigames.repository.UserRepository;
import com.kodigames.domain.User;

@Service
public class UserDbService {
    @Autowired
    private UserRepository userRepository;

    public void saveUser(User user) {
        return userRepository.save(user);
    }

    public void deleteUser(Long id) {
        return userRepository.deleteById(id);
    }

}
