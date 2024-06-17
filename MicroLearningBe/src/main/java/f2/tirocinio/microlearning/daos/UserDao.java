package f2.tirocinio.microlearning.daos;

import f2.tirocinio.microlearning.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserDao extends JpaRepository<User, Integer> {
	
	@Query(value = "SELECT * FROM users where username =:username", nativeQuery = true)
	User getUser(String username);
	
}
