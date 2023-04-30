package idv.gen96.crudrestfulapi.Service;

import idv.gen96.crudrestfulapi.Entity.User;

public interface UserService {
    User createUser(User user);

    User getUserById(long userId);
}
