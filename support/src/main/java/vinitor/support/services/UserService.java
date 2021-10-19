package vinitor.support.services;

import org.springframework.stereotype.Service;
import vinitor.support.entities.User;
import vinitor.support.persistence.UserRepository;

import javax.inject.Inject;
import java.util.List;

//Interaktion mit Datenbank
@Service
public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void create(){
        User user = new User("tes","Ana", "Hartk");
        userRepository.save(user);
    }

    public List<User> getAll(){
        return userRepository.findAll();
    }
}
