package userservice.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import userservice.user.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
