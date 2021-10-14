package vinitor.support.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import vinitor.support.entities.User;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
}
