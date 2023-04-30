package idv.gen96.crudrestfulapi.Service;

import idv.gen96.crudrestfulapi.Entity.User;

import java.util.List;

public interface UserService {
    User createUser(User user);

    User getUserById(long userId);

    List<User> getAllUsers();

    User updateUser(User user);
}
