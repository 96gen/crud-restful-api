package idv.gen96.crudrestfulapi.Repository;

import idv.gen96.crudrestfulapi.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
