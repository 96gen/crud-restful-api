package idv.gen96.crudrestfulapi.Service;

import idv.gen96.crudrestfulapi.Entity.User;
import idv.gen96.crudrestfulapi.Repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService{
    private UserRepository userRepository;

    @Override
    public User createUser(User user){
        return userRepository.save(user);
    }
}
