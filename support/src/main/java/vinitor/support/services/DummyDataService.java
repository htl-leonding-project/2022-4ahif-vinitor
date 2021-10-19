package vinitor.support.services;

import org.springframework.stereotype.Service;
import vinitor.support.entities.User;
import vinitor.support.persistence.UserRepository;

import javax.annotation.PostConstruct;

@Service
public class DummyDataService {
    UserRepository userRepository;

    public DummyDataService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostConstruct
    public void init(){
        userRepository.save(
                new User("dummy", "julian", "hautzy"));
    }
}
